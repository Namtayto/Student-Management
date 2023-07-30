package com.nam.sm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nam.sm.DAO.StudentDAO;
import com.nam.sm.api.Student;
import com.nam.sm.api.StudentDTO;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDAO studentDAO;
	
	@Override
	public List<Student> loadStudents() {
		List<Student> studentList = studentDAO.loadStudents();
		return studentList;
	}

	@Override
	public void saveStudent(StudentDTO studentDTO) {
		studentDAO.saveStudent(studentDTO);
		
	}

	@Override
	public StudentDTO geStudentDTO(int id) {
		
		return studentDAO.getStudentDTO(id);
	}

}
