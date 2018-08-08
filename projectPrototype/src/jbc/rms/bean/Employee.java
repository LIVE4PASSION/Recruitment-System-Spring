package jbc.rms.bean;

import java.sql.Date;

public class Employee {

	private int empId;
	private String empName;
	private String empMail;
	private String empMobile;
	private String empRole;
	private Date empDOB;
	private String empStatus;
	
	
	
	public Employee() {

	}
	public Employee(String empName, String empMail, String empMobile, String empRole, Date empDOB, String empStatus) {
		this.empName = empName;
		this.empMail = empMail;
		this.empMobile = empMobile;
		this.empRole = empRole;
		this.empDOB = empDOB;
		this.empStatus = empStatus;
	}
	public Employee(int empId, String empName, String empMail, String empMobile, String empRole, Date empDOB,
			String empStatus) {
		this.empId = empId;
		this.empName = empName;
		this.empMail = empMail;
		this.empMobile = empMobile;
		this.empRole = empRole;
		this.empDOB = empDOB;
		this.empStatus = empStatus;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpMail() {
		return empMail;
	}
	public void setEmpMail(String empMail) {
		this.empMail = empMail;
	}
	public String getEmpMobile() {
		return empMobile;
	}
	public void setEmpMobile(String empMobile) {
		this.empMobile = empMobile;
	}
	public String getEmpRole() {
		return empRole;
	}
	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}
	public Date getEmpDOB() {
		return empDOB;
	}
	public void setEmpDOB(Date empDOB) {
		this.empDOB = empDOB;
	}
	public String getEmpStatus() {
		return empStatus;
	}
	public void setEmpStatus(String empStatus) {
		this.empStatus = empStatus;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empMail=" + empMail + ", empMobile=" + empMobile
				+ ", empRole=" + empRole + ", empDOB=" + empDOB + ", empStatus=" + empStatus + "]";
	}
	
	
	
}
