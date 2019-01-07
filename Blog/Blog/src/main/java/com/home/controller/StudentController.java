package com.home.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.home.entity.Student;
import com.home.service.interf.StudentService;

@Controller
public class StudentController {
	@Value("${test}")
	private String Test;
	@Autowired
	private StudentService studentService;

	@RequestMapping(value="addStu/{name}",method=RequestMethod.GET)
	public String insertStu(@PathVariable String name,
			Model model) {
		Student student = new Student();
        /*student.setAge(17); 
		student.setName("王五");
		student.setSex("男");*/
		student.setName(name);
		System.out.println(Test+"ts");
		studentService.addStudent(student);
		model.addAttribute(student);
		return "test";
	}
}
