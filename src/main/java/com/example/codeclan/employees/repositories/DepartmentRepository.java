package com.example.codeclan.employees.repositories;

import com.example.codeclan.employees.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
