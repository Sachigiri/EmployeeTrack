package com.emp.track.service;

import java.util.List;

import com.emp.track.model.Employee;

public interface EmployeeService {
	
List<Employee> getAllEmployees();
void save(Employee employee);
Employee getEmployeeById(long id);
void delete(long id);
 


}
