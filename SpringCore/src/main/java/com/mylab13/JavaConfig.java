package com.mylab13;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.mylab13")

//@PropertySource("classpath:myresource.properties")
public class JavaConfig {

	@Bean
	@Scope("prototype")
	public Employee getEmployeeobj()
	{
		
		Employee employee=new Employee();
		
		return employee;
	}
}
