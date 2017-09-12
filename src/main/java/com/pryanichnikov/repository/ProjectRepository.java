package com.pryanichnikov.repository;

import com.pryanichnikov.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project,Long> {
}
