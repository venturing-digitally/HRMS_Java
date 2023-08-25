package com.HRMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HRMS.entity.Allowence;
@Repository
public interface AllowenceRepo extends JpaRepository<Allowence,Integer> {

}
