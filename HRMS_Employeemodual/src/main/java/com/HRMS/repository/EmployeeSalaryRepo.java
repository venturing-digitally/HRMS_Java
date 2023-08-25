package com.HRMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HRMS.entity.EmployeeSalary;
@Repository
public interface EmployeeSalaryRepo extends JpaRepository<EmployeeSalary,String>{

}
