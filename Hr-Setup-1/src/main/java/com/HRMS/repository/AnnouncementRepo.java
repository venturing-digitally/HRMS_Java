package com.HRMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HRMS.model.Announcement;

@Repository
public interface AnnouncementRepo extends JpaRepository<Announcement, Integer> {

}
