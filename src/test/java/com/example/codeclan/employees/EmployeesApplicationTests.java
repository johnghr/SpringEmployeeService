package com.example.codeclan.employees;

import com.example.codeclan.employees.models.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.codeclan.employees.repositories.EmployeeRepository;

@SpringBootTest
class EmployeesApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void createEmployee() {
		Employee employee = new Employee("Bob", 72, "55500FFG6", "hotmale@hotmail.com");
		employeeRepository.save(employee);
	}
}
