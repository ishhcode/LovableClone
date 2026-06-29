package com.Learning.project.Lovable_Clone.service.impl;

import com.Learning.project.Lovable_Clone.dto.member.InviteMemberRequest;
import com.Learning.project.Lovable_Clone.dto.member.MemberResponse;
import com.Learning.project.Lovable_Clone.dto.member.UpdateMemberRoleRequest;
import com.Learning.project.Lovable_Clone.entity.Project;
import com.Learning.project.Lovable_Clone.entity.ProjectMember;
import com.Learning.project.Lovable_Clone.entity.ProjectMemberId;
import com.Learning.project.Lovable_Clone.entity.User;
import com.Learning.project.Lovable_Clone.mapper.ProjectMemberMapper;
import com.Learning.project.Lovable_Clone.repository.ProjectMemberRepository;
import com.Learning.project.Lovable_Clone.repository.ProjectRepository;
import com.Learning.project.Lovable_Clone.repository.UserRepository;
import com.Learning.project.Lovable_Clone.service.ProjectMemberService;
import jakarta.transaction.Transactional;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Transactional
public class ProjectMemberServiceImpl implements ProjectMemberService {

    ProjectMemberRepository projectMemberRepository;
    ProjectRepository projectRepository;
    ProjectMemberMapper projectMemberMapper;
    UserRepository userRepository;

    @Override
    public List<MemberResponse> getMembers(Long projectId, Long userId) {
        Project project = getAccessibleProjectById(projectId, userId);
        List<MemberResponse> members = new ArrayList<>();
        members.add(projectMemberMapper.toMemberResponseFromUser(project.getOwner()));
        members.addAll(
                projectMemberRepository.findByIdProjectId(projectId)
                        .stream()
                        .map(projectMemberMapper::toMemberResponseFromProjectMember)
                        .toList());

        return members;
    }

    @Override
    public MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId) {
        Project project = getAccessibleProjectById(projectId, userId);
        if(!project.getOwner().getId().equals(userId)){
            throw new RuntimeException("You are not authorized to invite");
        }
        User invitee = userRepository.findByEmail(userId).orElseThrow();
        if(invitee.getId().equals(userId)){
            throw new RuntimeException("cannot invite yourself!");
        }
        ProjectMemberId projectMemberId = new ProjectMemberId(projectId, invitee.getId());
        if(projectMemberRepository.existsById(projectMemberId)){
            throw new RuntimeException("Already a project member!");
        }
        ProjectMember member = ProjectMember.builder()
                .id(projectMemberId)
                .project(project)
                .user(invitee)
                .role(request.role())
                .invitedAt(Instant.now())
                .build();
        projectMemberRepository.save(member);
        return projectMemberMapper.toMemberResponseFromProjectMember(member);
    }

    @Override
    public MemberResponse UpdateMemberRole(Long projectId,
                                           Long memberId,
                                           UpdateMemberRoleRequest request,
                                           Long userId) {
        Project project = getAccessibleProjectById(projectId, userId);
        if(!project.getOwner().getId().equals(userId)){
            throw new RuntimeException("You are not authorized to update role");
        }
        ProjectMemberId projectMemberId = new ProjectMemberId(projectId, memberId);
        ProjectMember member = projectMemberRepository.findById(projectMemberId).orElseThrow();
        member.setRole(request.role());
        projectMemberRepository.save(member);
        return projectMemberMapper.toMemberResponseFromProjectMember(member);
    }

    @Override
    public void RemoveProjectMember(Long projectId, Long memberId, Long userId) {
        Project project = getAccessibleProjectById(projectId, userId);
        if(!project.getOwner().getId().equals(userId)){
            throw new RuntimeException("You are not authorized to remove member");
        }
        ProjectMemberId projectMemberId = new ProjectMemberId(projectId, memberId);
        if(!projectMemberRepository.existsById(projectMemberId)){
            throw new RuntimeException("Not a project member!");
        }
        projectMemberRepository.deleteById(projectMemberId);
    }

    /// INTERNAL FUNCTION
    public Project getAccessibleProjectById(Long projectId, Long userId){
        return projectRepository.getAllAccessibleProjectById(projectId, userId)
                .orElseThrow();
    }
}
