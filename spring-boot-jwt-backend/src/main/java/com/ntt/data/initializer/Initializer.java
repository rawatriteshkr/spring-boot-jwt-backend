package com.ntt.data.initializer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.ntt.data.entity.Employee;
import com.ntt.data.service.MyUserDetailsService;

@Component
public class Initializer implements CommandLineRunner {

	@Autowired
	private MyUserDetailsService employeeService;

	@Override
	public void run(String... args) throws Exception {
		Employee emp = new Employee();
		emp.setUsername("ritesh");
		emp.setPassword("rkr@1234");
		employeeService.saveEmployee(emp);
	}

}
