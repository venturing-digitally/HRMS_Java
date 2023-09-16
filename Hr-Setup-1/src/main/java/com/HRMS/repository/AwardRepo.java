package com.HRMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.HRMS.model.Award;


@Repository
public interface AwardRepo extends JpaRepository<Award, Integer> {

}
