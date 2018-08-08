package jbc.rms.bean;

import java.sql.Date;

public class JobDetails {

	private int jobId;
	private String jobType;
	private String skills;
	private String jobLocation;
	private Date jobPostDate;
	private Date jobExpDate;
	private int salary;
	private int experienceRequired;
	private String jobProfile;
	private String jobStatus;
	
	public JobDetails(int jobId, String jobType, String skills, String jobLocation, Date jobPostDate, Date jobExpDate,
			int salary, int experienceRequired, String jobProfile, String jobStatus) {
		this.jobId = jobId;
		this.jobType = jobType;
		this.skills = skills;
		this.jobLocation = jobLocation;
		this.jobPostDate = jobPostDate;
		this.jobExpDate = jobExpDate;
		this.salary = salary;
		this.experienceRequired = experienceRequired;
		this.jobProfile = jobProfile;
		this.jobStatus = jobStatus;
	}
	
	public JobDetails() {
	
	}
	
	public JobDetails(String jobType, String skills, String jobLocation, Date jobPostDate, Date jobExpDate, int salary,
			int experienceRequired, String jobProfile, String jobStatus) {
		this.jobType = jobType;
		this.skills = skills;
		this.jobLocation = jobLocation;
		this.jobPostDate = jobPostDate;
		this.jobExpDate = jobExpDate;
		this.salary = salary;
		this.experienceRequired = experienceRequired;
		this.jobProfile = jobProfile;
		this.jobStatus = jobStatus;
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getJobLocation() {
		return jobLocation;
	}

	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}

	public Date getJobPostDate() {
		return jobPostDate;
	}

	public void setJobPostDate(Date jobPostDate) {
		this.jobPostDate = jobPostDate;
	}

	public Date getJobExpDate() {
		return jobExpDate;
	}

	public void setJobExpDate(Date jobExpDate) {
		this.jobExpDate = jobExpDate;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getExperienceRequired() {
		return experienceRequired;
	}

	public void setExperienceRequired(int experienceRequired) {
		this.experienceRequired = experienceRequired;
	}

	public String getJobProfile() {
		return jobProfile;
	}

	public void setJobProfile(String jobProfile) {
		this.jobProfile = jobProfile;
	}

	public String getJobStatus() {
		return jobStatus;
	}

	public void setJobStatus(String jobStatus) {
		this.jobStatus = jobStatus;
	}

	@Override
	public String toString() {
		return "JobDetails [jobId=" + jobId + ", jobType=" + jobType + ", skills=" + skills + ", jobLocation="
				+ jobLocation + ", jobPostDate=" + jobPostDate + ", jobExpDate=" + jobExpDate + ", salary=" + salary
				+ ", experienceRequired=" + experienceRequired + ", jobProfile=" + jobProfile + ", jobStatus="
				+ jobStatus + "]";
	}
	
	
	
}
