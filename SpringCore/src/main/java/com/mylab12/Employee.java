package com.mylab12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	@Value("12345")
	private  int employeeId;
	@Value("Harriet")
	private String employeeName;
	@Value("40000.0")
	private double salary;
	
	
	private SBUBean businessUnit;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public SBUBean getBusinessUnit() {
		return businessUnit;
	}
	@Autowired
	public void setBusinessUnit(SBUBean businessUnit) {
		this.businessUnit = businessUnit;
	}
	
	public SBUBean getSbuDetails()
	{
		businessUnit.getSbuName();
		businessUnit.getSbuHead();
		businessUnit.getSbuId();
		
		return businessUnit;
	}
	
	public void details()
	{
		System.out.println("Employee Details");
		System.out.println("--------------------------------------");
		System.out.println("Employee "+"[empName="+getEmployeeName()+" , empId="+getEmployeeId()+" , "
			+ "empSalary="+getSalary()+" , sbu deatils =[sbucode "+businessUnit.getSbuId()+" , sbuHead="+
			businessUnit.getSbuHead()+" , sbuName="+businessUnit.getSbuName()+"]");
				
		
	}
	
}
