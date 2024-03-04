package com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		
	ApplicationContext a=new ClassPathXmlApplicationContext("bean.xml");
	//Student stu=a.getBean("s1",Student.class);
	//or
	Student stu=(Student)a.getBean("s1");
	stu.disp();
	
	
	/*
	Resource rs=new ClassPathResource("bean.xml");
	BeanFactory beFactory=new XmlBeanFactory(rs);
	Student stu1=(Student)beFactory.getBean("s1");
	stu1.disp();  	
	
	*/
	}
}