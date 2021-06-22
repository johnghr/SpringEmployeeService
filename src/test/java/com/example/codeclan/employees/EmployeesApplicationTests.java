package com.example.codeclan.employees;

import com.example.codeclan.employees.models.Department;
import com.example.codeclan.employees.models.Employee;
import com.example.codeclan.employees.repositories.DepartmentRepository;
import com.example.codeclan.employees.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
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
	void contextLoads() {
	}

	@Test
	void createEmployee() {

		ArrayList<Employee> employees = new ArrayList<>();

		Department department = new Department("Lunch");
		departmentRepository.save(department);

		Employee employeeTwo = new Employee("Van", "Gough", "55500FFG6", department);

		Employee employee = new Employee("Bob", "Harris", "55500FFG6", department);
		employeeRepository.save(employee);
	}
}
