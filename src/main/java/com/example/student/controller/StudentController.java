package com.example.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.dto.Students;
import com.example.student.service.StudentService;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {
	
	@Autowired
	StudentService service;
	@GetMapping()
	public ResponseEntity<Students> getAllStudentsFromSchoolName(@RequestParam String schoolName)
	{
		return service.getAllStudentsBySchoolName(schoolName);
	}

	
}
