package com.emp.track.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emp.track.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
//here long is the type of primary key
}
