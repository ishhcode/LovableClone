package com.Learning.project.Lovable_Clone.dto.member;

import com.Learning.project.Lovable_Clone.Enum.ProjectRole;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public record UpdateMemberRoleRequest(
        ProjectRole role
) {
}
