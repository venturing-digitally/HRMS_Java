package com.HRMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HRMS.entity.Employee;

@Repository
public interface EmpRepo extends JpaRepository<Employee,Integer> {

}
