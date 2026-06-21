package com.Learning.project.Lovable_Clone.service.impl;

import com.Learning.project.Lovable_Clone.dto.member.InviteMemberRequest;
import com.Learning.project.Lovable_Clone.dto.member.MemberResponse;
import com.Learning.project.Lovable_Clone.dto.member.UpdateMemberRoleRequest;
import com.Learning.project.Lovable_Clone.service.ProjectMemberService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectMemberServiceImpl implements ProjectMemberService {
    @Override
    public List<MemberResponse> getMembers(Long projectId, Long userId) {
        return List.of();
    }

    @Override
    public MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId) {
        return null;
    }

    @Override
    public MemberResponse UpdateMemberRole(Long projectId, Long memberId, UpdateMemberRoleRequest request, Long userId) {
        return null;
    }

    @Override
    public MemberResponse DeleteProjectMember(Long projectId, Long memberId, Long userId) {
        return null;
    }
}
