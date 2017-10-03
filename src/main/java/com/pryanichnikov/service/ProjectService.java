package com.pryanichnikov.service;

import com.pryanichnikov.model.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProjectService {
	Project createOrUpdate(Project project);
	void delete(Long id);
	Project findById(Long id);
	Page<Project> getPage(Pageable pageable);
}
