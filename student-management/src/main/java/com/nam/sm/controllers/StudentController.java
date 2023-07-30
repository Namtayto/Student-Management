package com.nam.sm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nam.sm.api.Student;
import com.nam.sm.api.StudentDTO;
import com.nam.sm.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/showStudent")
	public String showStudentList(Model model) {
		
		List<Student> studentList = studentService.loadStudents();
		
		model.addAttribute("students", studentList);

		return "student-list";
	}
	
	@GetMapping("/showAddStudentPage")
	public String addStudent(Model model) {
		
		model.addAttribute("student", new StudentDTO());
		
		return "add-student";
	}
	
	@PostMapping("/save-student")
	public String saveStudent(StudentDTO studentDTO) {
		System.out.println(studentDTO);
		
		studentService.saveStudent(studentDTO);
		
		return "redirect:/showStudent";
	}
	
	@GetMapping("/updateStudent")
	public String updateStudent(@RequestParam("userId") int id,Model model) {
		
		StudentDTO Student = studentService.geStudentDTO(id);
		
		model.addAttribute("student", Student);

		
		return "add-student";
	}

}
