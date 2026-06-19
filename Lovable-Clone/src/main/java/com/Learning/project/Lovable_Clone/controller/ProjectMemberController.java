package com.Learning.project.Lovable_Clone.controller;


import com.Learning.project.Lovable_Clone.dto.member.InviteMemberRequest;
import com.Learning.project.Lovable_Clone.dto.member.MemberResponse;
import com.Learning.project.Lovable_Clone.dto.member.UpdateMemberRoleRequest;
import com.Learning.project.Lovable_Clone.service.ProjectMemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/projects/{projectId}/members")
public class ProjectMemberController {

    private final ProjectMemberService projectMemberService;   //constructor DI

    @GetMapping
    public ResponseEntity<List<MemberResponse>> getMembers(@PathVariable Long projectId){
        Long userId = 1L;
        return ResponseEntity.ok(projectMemberService.getMembers(projectId, userId));
    }

    @PostMapping
    public ResponseEntity<MemberResponse> inviteMember(@PathVariable Long projectId,
                                                       @RequestBody InviteMemberRequest request){
        Long userId =1L;
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(projectMemberService.inviteMember(projectId, request, userId));
    }

    @PatchMapping("/{memberId}")
    public ResponseEntity<MemberResponse> updateMemberRole(
            @PathVariable Long projectId,
            @PathVariable Long memberId,
            @RequestBody UpdateMemberRoleRequest request
    ){
        Long userId =1L;
        return ResponseEntity.ok(projectMemberService.UpdateMemberRole(projectId,memberId, request, userId));
    }

    @DeleteMapping("/{memberId}")
    public ResponseEntity<MemberResponse> deleteProjectMember(
            @PathVariable Long projectId,
            @PathVariable Long memberId
    ){
        Long userId =1L;
        return ResponseEntity.ok(projectMemberService.DeleteProjectMember(projectId,memberId, userId));
    }





}
