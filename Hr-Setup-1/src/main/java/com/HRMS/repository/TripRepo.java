package com.HRMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.HRMS.model.Trip;

@Repository
public interface TripRepo extends JpaRepository<Trip, Integer>{

}
