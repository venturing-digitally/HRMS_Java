package com.HRMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HRMS.entity.Saturationdeduction;
@Repository
public interface SaturationdeductionRepo extends JpaRepository<Saturationdeduction,String> {

}
