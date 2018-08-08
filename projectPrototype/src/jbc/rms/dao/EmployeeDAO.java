package jbc.rms.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import jbc.rms.bean.Employee;

@Repository
public class EmployeeDAO {
	
	JdbcTemplate template;

	public boolean validateEmployee(Employee employee) {
		return template.query("select * from employee", new ResultSetExtractor<Boolean>() {
			@Override
			public Boolean extractData(ResultSet rs) throws SQLException, DataAccessException {
				String empMail = null;
				String empPwd = null;
				while (rs.next()) {
					empMail = rs.getString("empmail");
					empPwd = rs.getString("empdob");
					if (employee.getEmpMail().equals(empMail) && employee.getEmpDOB().equals(empPwd)) {
						return true;
					}
				}
				return false;
			}

		});
	}

	
}
