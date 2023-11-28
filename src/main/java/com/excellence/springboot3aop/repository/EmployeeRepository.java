package com.excellence.springboot3aop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excellence.springboot3aop.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
