package com.home.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.dao.StudentDao;
import com.home.entity.Student;
import com.home.service.interf.StudentService;
@Service
public class StudentServiceImp implements StudentService {
    @Autowired
	private StudentDao studentDao;
	
	public void addStudent(Student student) {
		studentDao.insertStu(student);
	}

}
