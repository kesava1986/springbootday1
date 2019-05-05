package com.keshav.springboot.springbootapp.controller;

import javax.validation.metadata.MethodType;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.keshav.springboot.springbootapp.beans.Student;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@RequestMapping(value = "/hello")
	@GetMapping
	public String sayHello() {
		return "Hi Everyone how are you!";
	}
	
	@RequestMapping(value = "/studentDetails")
	@GetMapping
	public Student getStudentDetails() {
		Student student = new Student();
		student.setStudentName("Ramu");
		student.setStudentId("420");
		student.setStudentGrade("D");
		return student;
	}
}
