package com.capg.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.cap.Employee;

public interface IEmployeeService {


	Employee getEmployeeById(int id);
}
