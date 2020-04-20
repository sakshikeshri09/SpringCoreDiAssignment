package com.mylab1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class EmployeeMain {

	public static void main(String[] args) {
		
		
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	
	Class configurationClass=JavaConfig.class;
	context.register(configurationClass);
	context.refresh();
	
	//EmployeeBean empb=context.getBean(EmployeeBean.class);
	
	EmployeeService emp=context.getBean(EmployeeService.class);
	System.out.println(EmployeeService.class);
	emp.showDetails();
	}
	
}
