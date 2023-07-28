package com.nam.sm.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.nam.sm.api.Student;

public class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student newStudent = new Student();
		
		newStudent.setId(rs.getInt("id"));
		newStudent.setName(rs.getString("name"));
		newStudent.setMobile(rs.getLong("mobile"));
		newStudent.setCountry(rs.getString("country"));
		
		return newStudent;
	}

}
