package com.HRMS.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.HRMS.entity.Employee;
import com.HRMS.repository.EmpRepo;
@Service
public class Empservice {

	@Autowired
	private EmpRepo repo;
	
	public void AddEmp(Employee e) {
		repo.save(e);
	}
	
	public List<Employee> getAllEmp(){
		return repo.findAll() ;
	}
	
	public Employee getEmpBy(int id) {
		Optional<Employee> e=repo.findById(id); 
		if(e.isPresent()) {
			return e.get();
		}
		return null;
	}
	public void deleteEpm(int id) {
		repo.deleteById(id);
	}
}
