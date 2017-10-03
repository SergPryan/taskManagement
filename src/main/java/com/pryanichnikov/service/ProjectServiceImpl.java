package com.pryanichnikov.service;

import com.pryanichnikov.model.Project;
import com.pryanichnikov.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	ProjectRepository projectRepository;

	@Override
	public Project createOrUpdate(Project project) {
		return projectRepository.save(project);
	}

	@Override
	public void delete(Long id) {
      projectRepository.delete(id);
	}

	@Override
	public Project findById(Long id) {
		return projectRepository.findOne(id);
	}

	@Override
	public Page<Project> getPage(Pageable pageable) {
//		for(int i=0;i<5;i++){
//			Project project = new Project();
//			project.setName("projectName"+i);
//			projectRepository.save(project);
//		}
		return projectRepository.findAll(pageable);
	}
}
