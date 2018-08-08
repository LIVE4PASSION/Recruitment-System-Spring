
package jbc.rms.bean;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component
public class Candidate {

	private int cId;
	private String cFName;
	private String cLName;
	private String cGENDER;
	private Date cDOB;
	private String cMobileNum;
	private String cMail;
	private String cPassword;
	private String cCity;
	private int cExperienc;
	private String cRefer;
	
	
	public Candidate() {
		
	}

	public Candidate(String cFName, String cLName, String cGENDER, Date cDOB, String cMobileNum, String cMail,
			String cPassword, String cCity, int cExperienc, String cRefer) {
		this.cFName = cFName;
		this.cLName = cLName;
		this.cGENDER = cGENDER;
		this.cDOB = cDOB;
		this.cMobileNum = cMobileNum;
		this.cMail = cMail;
		this.cPassword = cPassword;
		this.cCity = cCity;
		this.cExperienc = cExperienc;
		this.cRefer = cRefer;
	}
	
	public Candidate(int cId, String cFName, String cLName, String cGENDER, Date cDOB, String cMobileNum,
			String cMail, String cPassword, String cCity, int cExperienc, String cRefer) {
		super();
		this.cId = cId;
		this.cFName = cFName;
		this.cLName = cLName;
		this.cGENDER = cGENDER;
		this.cDOB = cDOB;
		this.cMobileNum = cMobileNum;
		this.cMail = cMail;
		this.cPassword = cPassword;
		this.cCity = cCity;
		this.cExperienc = cExperienc;
		this.cRefer = cRefer;
	}

	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcFName() {
		return cFName;
	}
	public void setcFName(String cFName) {
		this.cFName = cFName;
	}
	public String getcLName() {
		return cLName;
	}
	public void setcLName(String cLName) {
		this.cLName = cLName;
	}
	public String getcGENDER() {
		return cGENDER;
	}
	public void setcGENDER(String cGENDER) {
		this.cGENDER = cGENDER;
	}
	public Date getcDOB() {
		return cDOB;
	}
	public void setcDOB(Date cDOB) {
		this.cDOB = cDOB;
	}
	public String getcMobileNum() {
		return cMobileNum;
	}
	public void setcMobileNum(String cMobileNum) {
		this.cMobileNum = cMobileNum;
	}
	public String getcMail() {
		return cMail;
	}
	public void setcMail(String cMail) {
		this.cMail = cMail;
	}
	public String getcPassword() {
		return cPassword;
	}
	public void setcPassword(String cPassword) {
		this.cPassword = cPassword;
	}
	public String getcCity() {
		return cCity;
	}
	public void setcCity(String cCity) {
		this.cCity = cCity;
	}
	public int getcExperienc() {
		return cExperienc;
	}
	public void setcExperienc(int cExperienc) {
		this.cExperienc = cExperienc;
	}
	public String getcRefer() {
		return cRefer;
	}
	public void setcRefer(String cRefer) {
		this.cRefer = cRefer;
	}

	@Override
	public String toString() {
		return "Candidate [cId=" + cId + ", cFName=" + cFName + ", cLName=" + cLName + ", cGENDER=" + cGENDER
				+ ", cDOB=" + cDOB + ", cMobileNum=" + cMobileNum + ", cMail=" + cMail + ", cPassword=" + cPassword
				+ ", cCity=" + cCity + ", cExperienc=" + cExperienc + ", cRefer=" + cRefer + "]";
	}
	
	
	
}
