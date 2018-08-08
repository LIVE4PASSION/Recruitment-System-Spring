package jbc.rms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jbc.rms.bean.Employee;
import jbc.rms.dao.EmployeeDAO;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDAO dao;
	
	public boolean validateEmployee(Employee employee) {
		return dao.validateEmployee(employee);
	}

}
