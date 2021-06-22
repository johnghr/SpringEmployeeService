package com.example.codeclan.employees;

import com.example.codeclan.employees.models.Department;
import com.example.codeclan.employees.models.Employee;
import com.example.codeclan.employees.models.Project;
import com.example.codeclan.employees.repositories.DepartmentRepository;
import com.example.codeclan.employees.repositories.ProjectRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.codeclan.employees.repositories.EmployeeRepository;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeesApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createEmployee() {

		Department department = new Department("Lunch");
		departmentRepository.save(department);

		Employee employee = new Employee("Bob", "Harris", "55500FFG6", department);
		employeeRepository.save(employee);
	}

	@Test
	public void addEmployeesAndProject(){
		Department department = new Department("Lunch");
		departmentRepository.save(department);

		Employee employee = new Employee("Bob", "Harris", "55500FFG6", department);
		employeeRepository.save(employee);

		Project project = new Project("Sandwich", 4);
		projectRepository.save(project);

		project.addEmployee(employee);
		projectRepository.save(project);
	}
}
