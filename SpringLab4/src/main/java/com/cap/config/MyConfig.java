package com.cap.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cap.Employee;
import com.cap.dao.EmployeeDaoImpl;
import com.capg.service.EmployeeServiceImpl;

@Configuration
@ComponentScan("com.capg")
public class MyConfig {
	
		@Bean
		public Employee method()
		{
			Employee obj=new Employee(106,"Sakshi",5620111.0);
			return obj;
		}
		
//106
		
//	@Bean
//	public EmployeeDaoImpl method2()
//	{
//		EmployeeDaoImpl obj=new EmployeeDaoImpl();
//		return obj;
//	}
}
