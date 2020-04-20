package com.mylab12;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mylab1.EmployeeService;
import com.mylab1.JavaConfig;

public class SbuMain {


	public static void main(String[] args) {
		
		
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	
	Class configurationClass=JavaConfig2.class;
	context.register(configurationClass);
	context.refresh();
	
	//EmployeeBean empb=context.getBean(EmployeeBean.class);
	
	Employee emp=context.getBean(Employee.class);
	System.out.println(Employee.class);
	emp.details();
	}
}
