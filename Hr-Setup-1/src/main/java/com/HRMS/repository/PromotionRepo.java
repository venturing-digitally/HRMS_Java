package com.HRMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HRMS.model.Promotion;

@Repository
public interface PromotionRepo  extends JpaRepository<Promotion, Integer>{

}
