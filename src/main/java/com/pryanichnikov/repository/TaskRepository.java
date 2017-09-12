package com.pryanichnikov.repository;

import com.pryanichnikov.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {
}
