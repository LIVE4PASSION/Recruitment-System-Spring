package jbc.rms.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import jbc.rms.bean.Admin;
import jbc.rms.bean.Candidate;
import jbc.rms.bean.Employee;
import jbc.rms.bean.JobDetails;

@Repository
public class AdminDAO {

	@Autowired
	private JdbcTemplate template;

	public boolean validateAdmin(Admin admin) {

		return template.query("select * from admin", new ResultSetExtractor<Boolean>() {
			@Override
			public Boolean extractData(ResultSet rs) throws SQLException, DataAccessException {
				String username_db = null;
				String password_db = null;
				while (rs.next()) {
					username_db = rs.getString(1);
					password_db = rs.getString(2);
					System.out.println(admin.getUserName());
					System.out.println(admin.getPassword());
					System.out.println(username_db);
					System.out.println(password_db);
					if (admin.getUserName().equals(username_db) && admin.getPassword().equals(password_db)) {
						System.out.println("test");
						return true;
					}
				}
				return false;
			}

		});

	}

	public List<Candidate> listCandidate() {

		return template.query("select * from candidate", new RowMapper<Candidate>() {

			@Override
			public Candidate mapRow(ResultSet rs, int arg1) throws SQLException {

				Candidate candidate = new Candidate();

				candidate.setcId(rs.getInt(1));
				candidate.setcFName(rs.getString(2));
				candidate.setcLName(rs.getString(3));
				candidate.setcGENDER(rs.getString(4));
				candidate.setcDOB(rs.getDate(5));
				candidate.setcMobileNum(rs.getString(6));
				candidate.setcMail(rs.getString(7));
				candidate.setcPassword(rs.getString(8));
				candidate.setcCity(rs.getString(9));
				candidate.setcExperienc(rs.getInt(10));
				candidate.setcRefer(rs.getString(11));
				return candidate;
			}
		});

	}

	public List<Employee> listEmployee() {
		
		return template.query("select * from employee", new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int arg1) throws SQLException {

				Employee employee = new Employee();
				employee.setEmpId(rs.getInt(1));
				employee.setEmpName(rs.getString(2));
				employee.setEmpMail(rs.getString(3));
				employee.setEmpMobile(rs.getString(4));
				employee.setEmpRole(rs.getString(5));
				employee.setEmpDOB(rs.getDate(6));
				employee.setEmpStatus(rs.getString(7));
				return employee;
			}
		});
		
	}

	public Employee loadEmployee(int id) {
		
		return template.queryForObject("select * from Employee where EMPID = ?", new EmployeeRowMapper(),id);
	}

	public int updateEmployee(Employee employee) {
		return template.update("update employee set empname = ?,empmail = ?,empmobile = ?,emprole = ?,empstatus = ? where EMPID = ?",employee.getEmpName(),employee.getEmpMail(),employee.getEmpMobile(),employee.getEmpRole(),employee.getEmpStatus(),employee.getEmpId());
	
	}

	public int deleteEmployee(int id) {
		
		return template.update("delete from employee where EMPID = ?",id);
		
	}

	public int addEmployee(Employee employee) {
		
		System.out.println("inside addEmployee dao");
		return template.update("insert into employee(EMPNAME,EMPMAIL,EMPMOBILE,EMPROLE,EMPDOB,EMPSTATUS) values(?,?,?,?,?,?)",employee.getEmpName(),employee.getEmpMail(),employee.getEmpMobile(),employee.getEmpRole(),employee.getEmpDOB(),employee.getEmpStatus());
	
	}

	public List<JobDetails> listJobs() {
		System.out.println("/jobs");
		return template.query("select * from job", new RowMapper<JobDetails>() {

			@Override
			public JobDetails mapRow(ResultSet rs, int arg1) throws SQLException {

				JobDetails jobs = new JobDetails();
				jobs.setJobType(rs.getString("jobtype"));
				jobs.setSkills(rs.getString("skills"));
				jobs.setJobLocation(rs.getString("joblocation"));
				jobs.setJobPostDate(rs.getDate("postdate"));
				jobs.setJobExpDate(rs.getDate("expdate"));
				jobs.setSalary(rs.getInt("salary"));
				jobs.setExperienceRequired(rs.getInt("experience"));
				jobs.setJobProfile(rs.getString("jobname"));
				jobs.setJobStatus(rs.getString("jobstatus"));
				return jobs;
			}
		});
	}

}

class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
		
		Employee employee = new Employee();
		employee.setEmpMobile(rs.getString("EMPMOBILE"));
		employee.setEmpRole(rs.getString("EMPROLE"));
		employee.setEmpStatus(rs.getString("EMPSTATUS"));
		return employee;
	}
	
}
