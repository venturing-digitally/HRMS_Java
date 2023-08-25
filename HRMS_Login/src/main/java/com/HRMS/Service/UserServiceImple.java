package com.HRMS.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HRMS.model.UserDetail;
import com.HRMS.repository.UserRepository;

@Service
public class UserServiceImple implements UserService {

	@Autowired
	private UserRepository UserRepo;
	
	@Override
	public UserDetail createUser(UserDetail user) {
		
		return UserRepo.save(user);
	}

}
