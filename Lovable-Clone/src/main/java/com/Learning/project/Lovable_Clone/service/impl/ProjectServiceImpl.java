package com.Learning.project.Lovable_Clone.service.impl;

import com.Learning.project.Lovable_Clone.dto.project.ProjectRequest;
import com.Learning.project.Lovable_Clone.dto.project.ProjectResponse;
import com.Learning.project.Lovable_Clone.dto.project.ProjectSummaryResponse;
import com.Learning.project.Lovable_Clone.entity.Project;
import com.Learning.project.Lovable_Clone.entity.User;
import com.Learning.project.Lovable_Clone.mapper.ProjectMapper;
import com.Learning.project.Lovable_Clone.repository.ProjectRepository;
import com.Learning.project.Lovable_Clone.repository.UserRepository;
import com.Learning.project.Lovable_Clone.service.ProjectService;
import jakarta.transaction.Transactional;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Transactional
public class ProjectServiceImpl implements ProjectService {

    ProjectRepository projectRepository;
    UserRepository userRepository;
    ProjectMapper projectMapper;

    @Override
    public ProjectResponse createUserProject(ProjectRequest request, Long userId) {
          User owner = userRepository.findById(userId).orElseThrow();
          Project project = Project.builder()
                  .name(request.name())
                  .owner(owner)
                  .isPublic(false)
                  .build();

          project = projectRepository.save(project);
          return projectMapper.toProjectResponse(project);
    }


    @Override
    public List<ProjectSummaryResponse> getUserProjects(Long userId) {
        User owner = userRepository.findById(userId).orElseThrow();
//        return projectRepository.getAllAccessibleProjects(userId)
//                .stream()
//                .map(projectMapper::toProjectSummaryResponse)
//                .collect(Collectors.toList());
        List<Project> projects = projectRepository.getAllAccessibleProjects(userId);
        return projectMapper.listProjectSummaryResponse(projects);
    }

    @Override
    public ProjectResponse getUserProjectById(Long projectId, Long userId) {
        User owner = userRepository.findById(userId).orElseThrow();
        Project project = getAccessibleProjectById(projectId, userId);
        return projectMapper.toProjectResponse(project);
    }

    @Override
    public ProjectResponse updateUserProject(Long id, ProjectRequest request,Long userId) {
        Project project = getAccessibleProjectById(id, userId);

        if(!project.getOwner().getId().equals(userId)){
            throw new RuntimeException("You are not allowed to update the project name.");
        }
        project.setName(request.name());
        project = projectRepository.save(project);
        return projectMapper.toProjectResponse(project);
    }

    @Override
    public void softDelete(Long id, Long userId) {

        Project project = getAccessibleProjectById(id, userId);
        if(!project.getOwner().getId().equals(userId)){
            throw new RuntimeException("You are not allowed to delete the project.");
        }

        project.setDeletedAt(Instant.now());
        projectRepository.save(project);  //detected and persisted by JPA's dirty checking when the @Transactional
    }


    /// INTERNAL FUNCTION
    public Project getAccessibleProjectById(Long projectId, Long userId){
        return projectRepository.getAllAccessibleProjectById(projectId, userId)
                .orElseThrow();
    }
}
