package com.capg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cap.Employee;
import com.cap.dao.EmployeeDaoImpl;
import com.cap.dao.IEmployeeDao;

@Component
public class EmployeeServiceImpl implements IEmployeeService {

	IEmployeeDao dao;
	public IEmployeeDao getDao() {
		return dao;
	}
	public void setDao(IEmployeeDao dao) {
		this.dao = dao;
	}
	
	public Employee getEmployeeById(int id) {
		dao=new EmployeeDaoImpl();
		Employee emp=dao.getEmployeeById(id);
		return emp;
	}

	
	public EmployeeServiceImpl() {
		IEmployeeDao dao=new EmployeeDaoImpl();
		// TODO Auto-generated constructor stub
	}

	
}
