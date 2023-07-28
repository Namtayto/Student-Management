package com.nam.sm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nam.sm.DAO.StudentDAO;

@Controller
public class StudentController {
	
	@Autowired
	private StudentDAO studentDAO;
	
	@GetMapping("/showStudent")
	public String showStudentList() {
		return "student-list";
	}
}
