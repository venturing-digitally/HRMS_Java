package com.HRMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HRMS.entity.OtherPayment;
@Repository
public interface OtherPaymentRepo extends JpaRepository<OtherPayment,String>{

}
