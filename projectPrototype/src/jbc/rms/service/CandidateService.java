package jbc.rms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jbc.rms.bean.Candidate;
import jbc.rms.bean.JobDetails;
import jbc.rms.bean.JobsApplied;
import jbc.rms.dao.CandidateDAO;

@Service
public class CandidateService {
	
	@Autowired
	CandidateDAO dao;

	public boolean validateCandidateLogin(Candidate candidate) {
		return dao.validateCandidateLogin(candidate);
	}

	public List<JobDetails> searchByFilter(JobDetails jobDetails) {
		return dao.searchByFilter(jobDetails);
		
	}

	
	public JobDetails loadAppliedJobs(int id) {
		return dao.loadAppliedJobs(id);
	}

	public int addJob(JobsApplied jobsApplied) {
		return dao.addJob(jobsApplied);
	}

	public List<JobDetails> listAppliedJobs() {
		return dao.listAppliedJobs();
	}

	public int saveRegisterationDetails(Candidate candidateDetails) {
		return dao.saveRegisterationDetails(candidateDetails);
	}

	

}
