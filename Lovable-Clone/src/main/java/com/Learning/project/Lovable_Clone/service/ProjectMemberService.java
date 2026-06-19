package com.Learning.project.Lovable_Clone.service;

import com.Learning.project.Lovable_Clone.dto.member.InviteMemberRequest;
import com.Learning.project.Lovable_Clone.dto.member.MemberResponse;
import com.Learning.project.Lovable_Clone.dto.member.UpdateMemberRoleRequest;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface ProjectMemberService {
     List<MemberResponse> getMembers(Long projectId, Long userId);

     MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId);

     MemberResponse UpdateMemberRole(Long projectId, Long memberId, UpdateMemberRoleRequest request, Long userId);

     MemberResponse DeleteProjectMember(Long projectId, Long memberId, Long userId);
}
