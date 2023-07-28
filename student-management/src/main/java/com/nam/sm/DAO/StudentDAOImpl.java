package com.nam.sm.DAO;

import java.util.List;

import org.apache.jasper.compiler.NewlineReductionServletWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nam.sm.api.Student;
import com.nam.sm.rowmapper.StudentRowMapper;

@Repository
public class StudentDAOImpl implements StudentDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Student> loadStudents() {

		String sql = "SELECT * FROM STUDENTS";
		List<Student> studentList = jdbcTemplate.query(sql, new StudentRowMapper());
		return studentList;
	}

}
