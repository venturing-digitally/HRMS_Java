package com.HRMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.HRMS.model.Resignation;

@Repository
public interface ResignationRepo extends JpaRepository<Resignation, Integer>{

}
