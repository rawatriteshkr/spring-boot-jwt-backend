package com.ntt.data.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ntt.data.entity.Employee;
import com.ntt.data.repo.EmployeeRepoImpl;

@Service
@Transactional
public class MyUserDetailsService implements UserDetailsService{

	@Autowired EmployeeRepoImpl employeeRepoImpl;
	
	public void saveEmployee(Employee employee) {
		employeeRepoImpl.save(employee);
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return employeeRepoImpl.loadUserByUsername(username);
	}

}
