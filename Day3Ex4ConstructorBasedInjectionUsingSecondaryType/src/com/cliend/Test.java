 package com.cliend;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
		Student stu=ac.getBean("s1",Student.class);
		System.out.println(stu.toString());
		System.out.println();
	}

}