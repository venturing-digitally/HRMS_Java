package com.HRMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HRMS.model.Holidays;

@Repository
public interface HolidaysRepo  extends JpaRepository<Holidays, Integer> {

}
