package com.Learning.project.Lovable_Clone.repository;

import com.Learning.project.Lovable_Clone.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
