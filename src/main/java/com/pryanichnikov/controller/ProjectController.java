package com.pryanichnikov.controller;

import com.pryanichnikov.model.Project;
import com.pryanichnikov.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    ProjectRepository projectRepository;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Page<Project>> getAll(Pageable pageable){
        return new ResponseEntity<>( projectRepository.findAll(pageable), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET,value = "/{id}")
    public ResponseEntity<Project> get(@PathVariable Long id){
        return new ResponseEntity<>(projectRepository.getOne(id),HttpStatus.OK);
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        projectRepository.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<Project> createOrUpdate(@RequestBody Project project){
        project = projectRepository.save(project);
        return new ResponseEntity<>(project,HttpStatus.OK);
    }


}
