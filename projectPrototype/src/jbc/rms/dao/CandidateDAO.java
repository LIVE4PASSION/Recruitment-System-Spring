package jbc.rms.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import jbc.rms.bean.Candidate;
import jbc.rms.bean.Employee;
import jbc.rms.bean.JobDetails;
import jbc.rms.bean.JobsApplied;

@Repository
public class CandidateDAO {

	@Autowired
	private JdbcTemplate template;

	public boolean validateCandidateLogin(Candidate candidate) {

		return template.query("select * from candidate", new ResultSetExtractor<Boolean>() {
			@Override
			public Boolean extractData(ResultSet rs) throws SQLException, DataAccessException {
				String email = null;
				String password_db = null;
				while (rs.next()) {
					email = rs.getString("cmail");
					password_db = rs.getString("cpword");
					if (candidate.getcMail().equals(email) && candidate.getcPassword().equals(password_db)) {
						return true;
					}
				}
				return false;
			}

		});
	}

	public List<JobDetails> searchByFilter(JobDetails jobDetails) {
		return template.execute("select * from job where skills=? or joblocation=?",
				new PreparedStatementCallback<List<JobDetails>>() {

					@Override
					public List<JobDetails> doInPreparedStatement(PreparedStatement ps)
							throws SQLException, DataAccessException {
						ps.setString(1, jobDetails.getSkills());
						ps.setString(2, jobDetails.getJobLocation());
						ResultSet rs = ps.executeQuery();
						JobDetails jb = null;
						List<JobDetails> jlist = new ArrayList<>();
						while (rs.next()) {
							Integer id = rs.getInt(1);
							String Jobtype = rs.getString("jobtype");
							String skills = rs.getString(3);
							String jl = rs.getString(4);
							Date d1 = rs.getDate(5);
							Date d2 = rs.getDate(6);
							Integer sal = rs.getInt(7);
							Integer exp = rs.getInt(8);
							String jn = rs.getString(9);
							String status = rs.getString(10);
							jb = new JobDetails(id, Jobtype, skills, jl, d1, d2, sal, exp, jn, status);
							jlist.add(jb);
						}
						return jlist;
					}
				});
	}

	public JobDetails loadAppliedJobs(int id) {
		return template.queryForObject("select * from job where jobID = ?", new JobDetailsRowMapper(), id);
	}

	public int addJob(JobsApplied jobsApplied) {
		return template.update("insert into appliedjobs(jobname,jobtype,jobstatus,expdate) values(?,?,?,?)",
				jobsApplied.getJobName(),jobsApplied.getJobType(), jobsApplied.getJobStatus(),jobsApplied.getJobExpDate());

	}

	class JobDetailsRowMapper implements RowMapper<JobDetails> {

		@Override
		public JobDetails mapRow(ResultSet rs, int arg1) throws SQLException {

			JobDetails jobs = new JobDetails();
			jobs.setJobType(rs.getString("jobtype"));
			jobs.setJobStatus(rs.getString("jobstatus"));
			jobs.setJobProfile(rs.getString("jobname"));
			jobs.setJobExpDate(rs.getDate("expdate"));
			return jobs;
		}

	}

	public List<JobDetails> listAppliedJobs() {
		return template.query("select * from appliedjobs", new RowMapper<JobDetails>() {

			@Override
			public JobDetails mapRow(ResultSet rs, int arg1) throws SQLException {

				JobDetails JobDetail = new JobDetails();
				JobDetail.setJobProfile(rs.getString("jobname"));
				JobDetail.setJobType(rs.getString("jobtype"));
				JobDetail.setJobStatus(rs.getString("jobstatus"));
				return JobDetail;
			}
		});
	}

	public int saveRegisterationDetails(Candidate candidateDetails) {
		return template.update(
				"insert into candidate(cfname,clname,cgender,cdob,cnum,cmail,cpword,ccity,cexp,crefer) values(?,?,?,?,?,?,?,?,?,?)",
				candidateDetails.getcFName(), candidateDetails.getcLName(), candidateDetails.getcGENDER(),
				candidateDetails.getcDOB(), candidateDetails.getcMobileNum(), candidateDetails.getcMail(),
				candidateDetails.getcPassword(),candidateDetails.getcCity(),candidateDetails.getcExperienc(),candidateDetails.getcRefer());
	}
}
