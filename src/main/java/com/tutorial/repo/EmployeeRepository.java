package com.tutorial.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutorial.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>	{

}
