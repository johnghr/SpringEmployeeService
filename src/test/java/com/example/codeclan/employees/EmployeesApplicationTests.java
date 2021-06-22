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

//	@Test
//	void createEmployee() {
//		Employee employee = new Employee("Bob", "Harris", "55500FFG6", department);
//		employeeRepository.save(employee);
//	}
}
