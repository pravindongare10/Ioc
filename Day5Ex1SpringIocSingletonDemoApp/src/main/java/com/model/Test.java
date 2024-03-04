package com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		
		ApplicationContext a=new ClassPathXmlApplicationContext("bean.xml");
		//Student stu=a.getBean("s1",Student.class);
		//or
		Student stu1=(Student)a.getBean("s1");
		System.out.println(stu1);
		Student stu2=(Student)a.getBean("s1");
		System.out.println(stu2);
		
	}
}