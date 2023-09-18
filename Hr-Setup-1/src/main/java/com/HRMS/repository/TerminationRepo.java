package com.HRMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.HRMS.model.Termination;

@Repository
public interface TerminationRepo extends JpaRepository<Termination, Integer>{

}
