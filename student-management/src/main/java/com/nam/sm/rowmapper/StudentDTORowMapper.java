package com.nam.sm.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.nam.sm.api.StudentDTO;

public class StudentDTORowMapper implements RowMapper<StudentDTO> {

	@Override
	public StudentDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		StudentDTO newStudent = new StudentDTO();

		newStudent.setName(rs.getString("name"));
		newStudent.setMobile(rs.getLong("mobile"));
		newStudent.setCountry(rs.getString("country"));

		return newStudent;
	}

}
