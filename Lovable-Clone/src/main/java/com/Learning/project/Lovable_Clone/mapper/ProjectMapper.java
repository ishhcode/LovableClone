package com.Learning.project.Lovable_Clone.mapper;

import com.Learning.project.Lovable_Clone.dto.project.ProjectResponse;
import com.Learning.project.Lovable_Clone.dto.project.ProjectSummaryResponse;
import com.Learning.project.Lovable_Clone.entity.Project;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProjectMapper {

    ProjectResponse toProjectResponse(Project project);

    @Mapping(source = "name" ,target = "projectName")
    ProjectSummaryResponse toProjectSummaryResponse(Project project);

    List<ProjectSummaryResponse> listProjectSummaryResponse(List<Project> projects);
}
