package com.HRMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HRMS.model.Complaints;

@Repository
public interface ComplaintsRepo extends JpaRepository<Complaints, Integer>{

}
