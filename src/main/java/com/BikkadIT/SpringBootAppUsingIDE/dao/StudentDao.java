package com.BikkadIT.SpringBootAppUsingIDE.dao;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {

	public StudentDao() {
		super();
		System.out.println("StudentDao Constructor");
	}
	
	public void saveStudentDao() {
		System.out.println("Taking data from service layer and send it to database layer");
	}
	
}
