package com.mylab13;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceClass {
	@Autowired
	SBU sbu;
	@Autowired
	Employee emp;

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	
	public void addEmployee(Employee emp) {
	
		
		sbu.getList().add(emp);
		
		

	}
	public List<Employee> getList()
	{
		List<Employee> l=sbu.getList();
		return l;
	}

	public SBU getSbu() {
		return sbu;
	}

	public void setSbu(SBU sbu) {
		this.sbu = sbu;
	}


}
