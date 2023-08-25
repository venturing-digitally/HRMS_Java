package com.HRMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HRMS.entity.Commission;
@Repository
public interface CommissionRepo extends JpaRepository<Commission,String> {

}
