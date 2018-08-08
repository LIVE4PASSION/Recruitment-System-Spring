package jbc.rms.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
import jbc.rms.bean.JobsApplied;
import jbc.rms.service.AdminService;
import jbc.rms.service.CandidateService;

@Controller
public class CandidateController {

	@Autowired
	CandidateService service;
	ModelAndView model = null;

	@RequestMapping(value = "/candidateLogin",method = RequestMethod.GET)
	public ModelAndView showLoginForm() {
		model = new ModelAndView("candidate-login");
		return model;	
	}
	
	@RequestMapping(value="/saveDetails",method=RequestMethod.POST)
	public ModelAndView saveRegisterationDetails(@ModelAttribute("regDetails")Candidate candidateDetails) {
		int status = service.saveRegisterationDetails(candidateDetails);
		model = new ModelAndView("candidate-dashboard");
		model.addObject("CandidateDetails", candidateDetails);
		return model;
	}
	
	@RequestMapping(value = "/loginValid", method = RequestMethod.POST)
	public ModelAndView signInCandidate(@ModelAttribute("CandidateLogin") Candidate candidate,HttpServletRequest request,HttpSession session) {
		String email  = request.getParameter("cMail");
		session.setAttribute("CANDIDATEEMAIL",email);
		boolean flag = service.validateCandidateLogin(candidate);
		if (flag) {
			model = new ModelAndView("candidate-dashboard");
			model.addObject("candidate", candidate);
		} else {
			model = new ModelAndView("candidate-login");
			model.addObject("errMsg", "Invalid Login Credentials");
		}
		return model;
		
	}
	
	@RequestMapping(value ="/candidateDashboard",method = RequestMethod.POST)
	public ModelAndView showCandidateDashboard() {
		model = new ModelAndView("candidate-dashboard");
		return model;
	}
	
	@RequestMapping(value ="/jobSearch",method = RequestMethod.GET)
	public ModelAndView searchByFilter(@ModelAttribute("CandidateJobSearch") JobDetails jobDetails) {
		List<JobDetails> list = service.searchByFilter(jobDetails);
		model = new ModelAndView("candidate-job-list");
		model.addObject("JOBLIST", list);
		return model;
	}
	
	@RequestMapping(value ="/applyJob",method = RequestMethod.GET)
	public ModelAndView showAppliedJobForm(@RequestParam("jobId")String CId,HttpSession session) {
		int id = Integer.parseInt(CId);
		JobDetails jobs = service.loadAppliedJobs(id);
		model = new ModelAndView("candidate-applied-job-confirmation-form");
		model.addObject("CANDIDATEJOBS",jobs);
		String cEmail = (String) session.getAttribute("CANDIDATEEMAIL");
		model.addObject("CEMAIL",cEmail);
		return model;
	}
	
	
	@RequestMapping(value ="/applyJobConfirmed",method = RequestMethod.GET)
	public ModelAndView storeJob(@ModelAttribute("JobApplied") JobsApplied jobsApplied) {
		int status = service.addJob(jobsApplied);
		return model;
	}
	
	
	@RequestMapping(value ="/viewAppliedJobs",method = RequestMethod.GET)
	public ModelAndView listAppliedJobs(@ModelAttribute("JobApplied") JobsApplied jobsApplied) {
		List<JobDetails> list = service.listAppliedJobs();
		model = new ModelAndView("candidate-applied-job");
		model.addObject("appliedjob",list);
		return model;
	}
	
	@RequestMapping(value ="/signUp",method = RequestMethod.GET)
	public ModelAndView giveMeUp() {
		model = new ModelAndView("candidate-signup");
		return model;
	}

}
