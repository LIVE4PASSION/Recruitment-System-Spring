
package jbc.rms.bean;

import java.sql.Date;

public class JobsApplied {

	private int cid;
	private int jid;
	private String jobName;
	private String jobType;
	private String jobStatus;
	private String cemail;
	private Date jobExpDate;

	public JobsApplied() {

	}

	/*public JobsApplied(int cid, int jid, String jobName, String jobType, String jobStatus, String cemail) {
		this.cid = cid;
		this.jid = jid;
		this.jobName = jobName;
		this.jobType = jobType;
		this.jobStatus = jobStatus;
		this.cemail = cemail;
	}*/
	
	

	public JobsApplied(int cid, int jid, String jobName, String jobType, String jobStatus, String cemail,
			Date jobExpDate) {
		this.cid = cid;
		this.jid = jid;
		this.jobName = jobName;
		this.jobType = jobType;
		this.jobStatus = jobStatus;
		this.cemail = cemail;
		this.jobExpDate = jobExpDate;
	}

	public Date getJobExpDate() {
		return jobExpDate;
	}

	public void setJobExpDate(Date jobExpDate) {
		this.jobExpDate = jobExpDate;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getJid() {
		return jid;
	}

	public void setJid(int jid) {
		this.jid = jid;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public String getJobStatus() {
		return jobStatus;
	}

	public void setJobStatus(String jobStatus) {
		this.jobStatus = jobStatus;
	}

	public String getCemail() {
		return cemail;
	}

	public void setCemail(String cemail) {
		this.cemail = cemail;
	}

}
