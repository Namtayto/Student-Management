package com.nam.sm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nam.sm.DAO.StudentDAO;
import com.nam.sm.api.Student;
import com.nam.sm.api.StudentDTO;

@Controller
public class StudentController {
	
	@Autowired
	private StudentDAO studentDAO;
	
	@GetMapping("/showStudent")
	public String showStudentList(Model model) {
		
		List<Student> studentList = studentDAO.loadStudents();
		
		model.addAttribute("students", studentList);

		return "student-list";
	}
	
	@GetMapping("/showAddStudentPage")
	public String addStudent(Model model) {
		
		model.addAttribute("student", new StudentDTO());
		
		return "add-student";
	}
	
	@ResponseBody
	@GetMapping("/save-student")
	public String saveStudent() {
		
		return "Student saved...";
	}
}
