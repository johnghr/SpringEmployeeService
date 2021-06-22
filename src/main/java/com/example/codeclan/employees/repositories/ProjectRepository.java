package com.example.codeclan.employees.repositories;

import com.example.codeclan.employees.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
