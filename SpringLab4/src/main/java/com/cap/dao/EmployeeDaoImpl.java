package com.cap.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cap.Employee;

@Component

public class EmployeeDaoImpl implements IEmployeeDao{

	private  static HashMap<Integer,Employee> list=new HashMap<Integer,Employee>();
	
	
	static {
		Employee emp1=new Employee(100,"Rama",12345.67);
		Employee emp2=new Employee(101,"Ramesh",12125.67);
		Employee emp3=new Employee(102,"Ramaji",12346.67);
		
		list.put(emp1.getEmpId(),emp1);
		list.put(emp2.getEmpId(),emp2);
		list.put(emp3.getEmpId(),emp3);
	}

	public HashMap<Integer, Employee> getList() {
		return list;
	}

	
	

	public void setList(HashMap<Integer, Employee> list) {
		this.list = list;
	}



	public Employee getEmployeeById(int id) {
		Employee emp=list.get(id);
		
		return emp;
	}
	

	
}
