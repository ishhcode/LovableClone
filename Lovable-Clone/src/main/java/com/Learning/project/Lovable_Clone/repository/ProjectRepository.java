package com.Learning.project.Lovable_Clone.repository;

import com.Learning.project.Lovable_Clone.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project,Long> {

    @Query("""
            SELECT p from Project
            WHERE p.deletedAt IS NULL
            AND p.owner.id = :userId
            ORDER BY p.updatedAt DESC
            """)
    List<Project> getAllAccessibleProjects(Long userId);
}
