package jbc.rms.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jbc.rms.bean.Admin;
import jbc.rms.bean.Candidate;
import jbc.rms.bean.Employee;
import jbc.rms.bean.JobDetails;
import jbc.rms.service.AdminService;

@Controller
public class AdminController {

	@Autowired
	AdminService service;
	ModelAndView model = null;

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public ModelAndView getLogin() {
		System.out.println("test");
		model = new ModelAndView("admin-login");
		return model;
	}

	@RequestMapping(value = "/submit", method = RequestMethod.POST)
	public ModelAndView signInAdmin(@ModelAttribute("AdminLogin") Admin admin) {
		boolean flag = service.validateAdmin(admin);
		if (flag) {
			model = new ModelAndView("submit");
			model.addObject("admin", admin);
		} else {
			model = new ModelAndView("admin-login");
			model.addObject("errMsg", "Invalid Login Credentials");
		}
		return model;
	}

	@RequestMapping(value = "/showEmployee", method = RequestMethod.POST)
	public ModelAndView listEmployee(@ModelAttribute("Admin") Admin admin) {
		service.listEmployee();
		return model;
	}

	@RequestMapping(value = "/candidate", method = RequestMethod.GET)
	public ModelAndView listCandidate() {
		System.out.println("Candidate");
		List<Candidate> listCandidate = service.listCandidate();
		for (Candidate c : listCandidate) {
			System.out.println(c);
		}

		model = new ModelAndView("admin-candidate");
		model.addObject("candidate", listCandidate);
		System.out.println(listCandidate);
		return model;
	}

	@RequestMapping(value="/employee",method=RequestMethod.GET)
	public ModelAndView listEmployee() {
		System.out.println("Employee");
		List<Employee> listEmployee = service.listEmployee();
		for(Employee e:listEmployee) {
			System.out.println(e);
		}

		model = new ModelAndView("admin-employee");
		model.addObject("emp",listEmployee);
		System.out.println(listEmployee);
		return model;
	}

	@RequestMapping(value="/load",method=RequestMethod.GET)
	public ModelAndView loadEmployee(@RequestParam("empId")String empId) {
		int id = Integer.parseInt(empId);
		Employee employee = service.loadEmployee(id);
		model = new ModelAndView("update-employee");
		model.addObject("EMPLOYEE", employee);
		model.addObject("ID",id);
		return model;
	}
	
	@RequestMapping(value="/update",method=RequestMethod.GET)
	public ModelAndView updateEmployee(@ModelAttribute("employee")Employee employee) {
		int status = service.updateEmployee(employee);
		model = new ModelAndView("update-confirmation");
		if(status==1) {
			model.addObject("UPDATEEMP","Employee Updation Successful!");
		}
		else {
			model.addObject("UPDATEEMP","Employee Updation Failed!");
		}
		return model;
	}
	
	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public ModelAndView deleteEmployee(@RequestParam("empId")String empId) {
		int id = Integer.parseInt(empId);
		int status = service.deleteEmployee(id);
		model = new ModelAndView("delete-confirmation");
		if(status==1) {
			model.addObject("DELETEEMP","Employee Deletion Successful!");
		}
		else {
			model.addObject("DELETEEMP","Employee Deletion Failed!");
		}
		return model;
	}
		
	@RequestMapping(value="/addEmployee",method=RequestMethod.GET)
	public ModelAndView addEmployee(@ModelAttribute("employeeForm")Employee employee) {
		System.out.println("Inside /addEmployee");
		int status = service.addEmployee(employee);
		model = new ModelAndView("insert-confirmation");
		if(status==1) {
			model.addObject("INSERTEMP","Employee Insertion Successful!");
		}
		else {
			model.addObject("INSERTEMP","Employee Insertion Failed!");
		}
		return model;
	}


	@RequestMapping("/job")
	public ModelAndView listJobs() {
		List<JobDetails> jobList = service.listJobs();
		model = new ModelAndView("job-details");
		model.addObject("JOBS",jobList);
		return model;

		
	}
}
