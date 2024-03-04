 package com.model;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		
		Resource rs=new ClassPathResource("bean.xml");
		BeanFactory beFactory=new XmlBeanFactory(rs);
		Student stu1=(Student)beFactory.getBean("s1");
		System.out.println(stu1);
		Student stu2=(Student)beFactory.getBean("s1");
		System.out.println(stu2);
		Student stu3=(Student)beFactory.getBean("s1");
		System.out.println(stu3);
	}
}