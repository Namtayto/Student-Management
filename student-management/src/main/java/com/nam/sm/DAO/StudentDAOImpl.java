package com.nam.sm.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nam.sm.api.Student;
import com.nam.sm.api.StudentDTO;
import com.nam.sm.rowmapper.StudentDTORowMapper;
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

	@Override
	public void saveStudent(StudentDTO studentDTO) {
		Object[] sqlParameters = {studentDTO.getName(),studentDTO.getMobile(),studentDTO.getCountry()};
		
		String sql = "INSERT INTO STUDENTS(name,mobile,country) VALUES(?,?,?)";
		
		jdbcTemplate.update(sql,sqlParameters);
		
		
	}

	@Override
	public StudentDTO getStudentDTO(int id) {
		String sql = "SELECT * FROM STUDENTS WHERE ID = ?";
		
		
		StudentDTO studentDTO = jdbcTemplate.queryForObject(sql, new StudentDTORowMapper(),id);
		return studentDTO;
	}

	@Override
	public void updateStudent(StudentDTO studentDTO) {
		// TODO Auto-generated method stub
		String sql = "UPDATE STUDENTS SET name=?, mobile=?, country=? WHERE id=?";
		Object[] sqlParameters = {studentDTO.getName(),studentDTO.getMobile(),studentDTO.getCountry(),studentDTO.getId()};
		jdbcTemplate.update(sql,sqlParameters);
	}

}
