package com.mylab13;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeMain {

	SBU sbu;

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		Class configurationClass = JavaConfig.class;
		context.register(configurationClass);
		context.refresh();

		 SBU sbu=context.getBean(SBU.class);
		//to create an another object of employee
		Employee employee = context.getBean(Employee.class);

		employee.setEmployeeId(12346);
		employee.setEmployeeName("Ramesh");
		employee.setSalary(56000.2);
		//System.out.println(employee);
		// Employee employee2 = context.getBean(Employee.class);
		// System.out.println(employee2);
		//	boolean d = employee == employee2;
		//System.out.println(d);

		ServiceClass service = context.getBean(ServiceClass.class);

		System.out.println("SBU Details ");
		System.out.println("-------------------------------");
		System.out.println("SBU Code="+sbu.getSbuId()+" SBU name="+sbu.getSbuName()+" SBU salary"+sbu.getSbuHead());
		System.out.println("Employee Details");
		System.out.println("---------------------------------------------------------------------------------");
		//to add new object in list
		service.addEmployee(employee);
		// service.addEmployee(employee2);
		System.out.println(sbu.getList());
	}

}
