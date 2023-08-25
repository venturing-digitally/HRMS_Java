package com.HRMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HRMS.model.UserDetail;

public interface UserRepository extends JpaRepository<UserDetail,Integer>{

}
