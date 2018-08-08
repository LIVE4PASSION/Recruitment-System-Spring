package jbc.rms.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jbc.rms.bean.Admin;
import jbc.rms.bean.Candidate;
import jbc.rms.bean.Employee;
import jbc.rms.bean.JobDetails;
import jbc.rms.dao.AdminDAO;

@Service
public class AdminService {
	
	@Autowired
	AdminDAO dao;

	public boolean validateAdmin(Admin admin) {
		return dao.validateAdmin(admin);
	}

	public List<Candidate> listCandidate(){
		return dao.listCandidate();
	}
	
	public List<Employee> listEmployee(){
		return dao.listEmployee();
	}

	public Employee loadEmployee(int id) {
		return dao.loadEmployee(id);
	}

	public int updateEmployee(Employee employee) {
		return dao.updateEmployee(employee);
		// TODO Auto-generated method stub
		
	}

	public int deleteEmployee(int id) {
		return dao.deleteEmployee(id);
	}

	public int addEmployee(Employee employee) {
		
		/*SimpleDateFormat sdf1 = new SimpleDateFormat("MM-dd-yyyy");
		java.util.Date date = sdf1.parse(startDate);
		java.sql.Date sqlStartDate = new java.sql.Date(date.getTime()); */
		System.out.println("inside addEmployee service");
		return dao.addEmployee(employee);
	
	}

	public List<JobDetails> listJobs() {
		return dao.listJobs();
		
		
	}

	
}
