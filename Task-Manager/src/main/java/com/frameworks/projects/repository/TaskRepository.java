package com.frameworks.projects.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.frameworks.projects.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
