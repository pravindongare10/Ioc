package com.cliend;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;
import com.model.Student;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
			Student stu=(Student)ac.getBean("s");
	}

}
