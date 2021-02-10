package com.ntt.data.repo;

import org.springframework.security.core.userdetails.UserDetails;

import com.ntt.data.entity.Employee;

public interface EmployeeRepo {
	
	public void save(Employee user);

	public UserDetails loadUserByUsername(String username);

}
