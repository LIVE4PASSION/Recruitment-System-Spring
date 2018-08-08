package jbc.rms.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jbc.rms.bean.Admin;
import jbc.rms.bean.Employee;
import jbc.rms.service.AdminService;
import jbc.rms.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService service;
	ModelAndView model = null;

	@RequestMapping(value = "/employeeLogin", method = RequestMethod.GET)
	public ModelAndView getEmployeeLogin() {
		model = new ModelAndView("employee-login");
		return model;
	}

	@RequestMapping(value = "/submitEmpCredentials", method = RequestMethod.POST)
	public ModelAndView signInEmployee(@ModelAttribute("EmployeeLogin") Employee employee,HttpServletRequest request) {
		String empRole = request.getParameter("empRole");
		System.out.println(empRole);
		boolean flag = service.validateEmployee(employee);
		if (flag) {
			model = new ModelAndView("employee-dashboard");
			model.addObject("EMPLOYEE", employee);
		} else {
			model = new ModelAndView("employee-login");
			model.addObject("errMsg", "Invalid Login Credentials");
		}
		return model;
	}
}
