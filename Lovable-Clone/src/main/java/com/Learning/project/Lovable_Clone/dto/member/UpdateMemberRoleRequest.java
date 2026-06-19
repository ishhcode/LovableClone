package com.Learning.project.Lovable_Clone.dto.member;

import com.Learning.project.Lovable_Clone.Enum.ProjectRole;

public record UpdateMemberRoleRequest(
        ProjectRole role
) {
}
