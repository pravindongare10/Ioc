package com.model;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		//Lazy Loading
		ApplicationContext a=new ClassPathXmlApplicationContext("bean.xml");
		Student stu1=(Student)a.getBean("s1");
	}
}