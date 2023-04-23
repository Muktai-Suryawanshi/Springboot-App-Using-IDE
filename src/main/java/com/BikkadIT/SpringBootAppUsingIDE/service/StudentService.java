package com.BikkadIT.SpringBootAppUsingIDE.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.SpringBootAppUsingIDE.dao.StudentDao;

@Service
public class StudentService {
	
	@Autowired
	private StudentDao studentDao;

	public StudentService() {
		super();
		System.out.println("Student Service Controller");

	}
	public void saveStudentService() {
		System.out.println("Taking data from controller and send it to dao layer");
		studentDao.saveStudentDao();
		
	}
	
	

}
