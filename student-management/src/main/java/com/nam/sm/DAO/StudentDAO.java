package com.nam.sm.DAO;

import java.util.List;

import com.nam.sm.api.Student;
import com.nam.sm.api.StudentDTO;

public interface StudentDAO {
	List<Student> loadStudents();
	
	void saveStudent(StudentDTO studentDTO);
	
	StudentDTO getStudentDTO(int id);
	
	void updateStudent(StudentDTO studentDTO);
	
	void deleteStudent(int id);
	
	
	
	
}
