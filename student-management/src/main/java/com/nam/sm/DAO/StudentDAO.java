package com.nam.sm.DAO;

import java.util.List;

import com.nam.sm.api.Student;

public interface StudentDAO {
	List<Student> loadStudents();
}
