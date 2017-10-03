package com.pryanichnikov.controller;

import com.pryanichnikov.model.Project;
import com.pryanichnikov.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    ProjectService projectService;

    @GetMapping
    public ResponseEntity<Page<Project>> getAll(Pageable pageable){
        return new ResponseEntity<>( projectService.getPage(pageable), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Project> get(@PathVariable Long id){
        return new ResponseEntity<>(projectService.findById(id),HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        projectService.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }
    @PutMapping
    public ResponseEntity<Project> createOrUpdate(@RequestBody Project project){
        project = projectService.createOrUpdate(project);
        return new ResponseEntity<>(project,HttpStatus.OK);
    }


}
