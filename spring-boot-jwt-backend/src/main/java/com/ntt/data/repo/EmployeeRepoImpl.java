package com.ntt.data.repo;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import com.ntt.data.entity.Employee;

@Repository
public class EmployeeRepoImpl implements EmployeeRepo{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void save(Employee employee) {
		Session session = sessionFactory.getCurrentSession();
		session.save(employee);
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) {
		Session session = sessionFactory.getCurrentSession();
		String queryString = "from Employee where username = :username";
		System.out.println(queryString);
		Query query = session.createQuery(queryString);
		query.setString("username", username);
		Employee employee = (Employee) query.getSingleResult();
		System.out.println(employee.getUsername() + ":" + employee.getPassword());
		return new org.springframework.security.core.userdetails.User(employee.getUsername(), employee.getPassword(),
				new ArrayList<>());
	}

}
