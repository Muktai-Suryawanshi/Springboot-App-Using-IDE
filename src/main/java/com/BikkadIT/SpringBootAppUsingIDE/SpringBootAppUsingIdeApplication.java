package com.BikkadIT.SpringBootAppUsingIDE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.BikkadIT.SpringBootAppUsingIDE.controller.StudentController;

@SpringBootApplication
public class SpringBootAppUsingIdeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(SpringBootAppUsingIdeApplication.class,args);
	    StudentController bean = configurableApplicationContext.getBean("studentController",StudentController.class); 

		
		bean.saveStudentController();
		
	}

}
