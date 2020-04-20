package com.cap.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cap.Employee;
import com.cap.config.MyConfig;
import com.cap.dao.IEmployeeDao;
import com.capg.service.EmployeeServiceImpl;
import com.capg.service.IEmployeeService;


public class MyMain {

	public static void main(String[] args) {
		
		System.out.println("enter id:");
		
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		Class configurationClass=MyConfig.class;
		context.register(configurationClass);
		context.refresh();
		IEmployeeService service=context.getBean(IEmployeeService.class);
		if(service.getEmployeeById(id)==null)
		{
			System.out.println("Employee not exists");
		}else {
	
			System.out.println("Employee details");
			System.out.println("----------------------------------");
		System.out.println("Employee Id = "+service.getEmployeeById(id).getEmpId());
			System.out.println("Employee Name= "+service.getEmployeeById(id).getEmpName());
			System.out.println("Employee Salary = "+service.getEmployeeById(id).getEmpSalary());	}
		}
}
