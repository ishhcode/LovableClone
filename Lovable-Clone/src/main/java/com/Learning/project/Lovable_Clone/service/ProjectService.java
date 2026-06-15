package com.Learning.project.Lovable_Clone.service;

import com.Learning.project.Lovable_Clone.dto.project.ProjectRequest;
import com.Learning.project.Lovable_Clone.dto.project.ProjectResponse;
import com.Learning.project.Lovable_Clone.dto.project.ProjectSummaryResponse;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface ProjectService {
    List<ProjectSummaryResponse> getUserProjects(Long userId);

    ProjectResponse getUserProjectById(Long projectId, Long userId);

    ProjectResponse createUserProject(ProjectRequest request, Long userId);

    ProjectResponse updateUserProject(Long id, ProjectRequest request);

    void softDelete(Long id, Long userId);
}
