package com.Learning.project.Lovable_Clone.mapper;

import com.Learning.project.Lovable_Clone.Enum.ProjectRole;
import com.Learning.project.Lovable_Clone.dto.member.MemberResponse;
import com.Learning.project.Lovable_Clone.entity.ProjectMember;
import com.Learning.project.Lovable_Clone.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProjectMemberMapper {

    @Mapping(target = "userId" ,source="id")
    @Mapping(target= "projectRole", constant = "OWNER")  //check
    MemberResponse toMemberResponseFromUser(User ownerId);
    @Mapping(target="userId", source = "user.id")
    @Mapping(target="email", source = "user.email")//nested
    @Mapping(target="name", source = "user.name")
    MemberResponse toMemberResponseFromProjectMember(ProjectMember projectMember);
}
