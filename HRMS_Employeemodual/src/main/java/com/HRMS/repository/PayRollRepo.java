package com.HRMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HRMS.entity.PayRoll;
@Repository
public interface PayRollRepo extends JpaRepository<PayRoll,Integer>{

}
