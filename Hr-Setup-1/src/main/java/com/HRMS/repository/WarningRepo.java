package com.HRMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.HRMS.model.Warning;

@Repository
public interface WarningRepo extends JpaRepository<Warning, Integer>{

}
