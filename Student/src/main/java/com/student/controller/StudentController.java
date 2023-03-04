package com.student.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.Service.StudentService;
import com.student.model.StudentModel;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping ("/api/student")
@AllArgsConstructor
public class StudentController {
	
	private final  StudentService studentService;
	
	
	@PostMapping("/save")
	public StudentModel createStudent(@RequestBody StudentModel studentInputModel)
	{
		return studentService.saveStudent(studentInputModel);
		
		
	}
	
	@GetMapping("/findAll")
	public List<StudentModel> findAllStudent()
	{
		return studentService.findAllStudents();
	}
 
}
