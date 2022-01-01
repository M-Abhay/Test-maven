package com.example.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.student.dto.Students;
import com.example.student.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository repo;
	
	public ResponseEntity<Students> getAllStudentsBySchoolName(String schoolName)
	{
		Students s=new Students();
		s.setStudents(repo.findAllBySchoolName(schoolName));
		return new ResponseEntity<Students>(s, HttpStatus.OK);
	}
}
