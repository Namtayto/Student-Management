package com.nam.sm.service;

import java.util.List;

import com.nam.sm.api.Student;
import com.nam.sm.api.StudentDTO;

public interface StudentService {
	List<Student> loadStudents();

	void saveStudent(StudentDTO studentDTO);
	
	StudentDTO geStudentDTO(int id);

	void updateStudent(StudentDTO studentDTO);
}
