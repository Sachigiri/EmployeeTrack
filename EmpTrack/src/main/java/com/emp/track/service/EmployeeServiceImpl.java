package com.emp.track.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.track.model.Employee;
import com.emp.track.repository.EmployeeRepository;

@Service

public class EmployeeServiceImpl implements EmployeeService {
   @Autowired
   private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		this.employeeRepository.save(employee);
		
	}

	@Override
	public Employee getEmployeeById(long id) {
		// TODO Auto-generated method stub
		 Optional<Employee>optional=employeeRepository.findById(id);
		 //findByiD return an optional
		 Employee employee=null;
		 if(optional.isPresent()) {
			employee=optional.get();
		 }
		 else
		 {
		 throw new RuntimeException("Employee is not found for id::"+"id");
		 
		 }
		 return employee;
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(id);
		
	}

}
