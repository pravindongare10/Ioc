package com.model;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	public static void main(String[] args) {
		
		ApplicationContext a1=new ClassPathXmlApplicationContext("bean.xml");

	}
}