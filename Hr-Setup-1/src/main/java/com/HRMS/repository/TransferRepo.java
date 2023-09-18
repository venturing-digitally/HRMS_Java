package com.HRMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.HRMS.model.Transfer;

@Repository
public interface TransferRepo extends JpaRepository<Transfer, Integer>{

}
