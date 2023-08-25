package com.HRMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HRMS.entity.Loan;
@Repository
public interface LoanRepo extends JpaRepository<Loan,String> {

}
