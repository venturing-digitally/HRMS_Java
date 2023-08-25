package com.HRMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HRMS.entity.Overtime;
@Repository
public interface OvertimeRepo extends JpaRepository<Overtime,String>{

}
