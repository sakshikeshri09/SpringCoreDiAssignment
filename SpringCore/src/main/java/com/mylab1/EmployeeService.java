package com.mylab1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {

	
	EmployeeBean emp;

	public EmployeeBean getEmp() {
		return emp;
	}

	@Autowired
	public void setEmp(EmployeeBean emp) {
		this.emp = emp;
	}
	
	
	public void showDetails()
	{
		System.out.println("Employee Details");
		System.out.println("--------------------------------------");
		System.out.println("Emp Id: "+emp.getEmployeeId());
		System.out.println("Emp Name: "+emp.getEmployeeName());
		System.out.println("Emp Salary: "+emp.getSalary());
		System.out.println("Emp BU: "+emp.getBusinessUnit());
		System.out.println("Emp Age: "+emp.getAge());
	}
}
