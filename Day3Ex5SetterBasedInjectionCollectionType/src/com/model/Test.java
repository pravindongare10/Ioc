 package com.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("bean.xml");
		
		Student stu=a.getBean("s1",Student.class);
		List<String> l1=stu.getCities();
		for(String s : l1) {
			System.out.println(s);

		}
		Set<Long>svalue=stu.getMobiles();
		for (Long city : svalue) {
			System.out.println(city);
		}
		
		Map<String, Integer>map=stu.getContycode();
		
		Set<String>keys=map.keySet();
		
		for (String key : keys) {
			System.out.println(key);
			Integer contrycode=map.get(key);
			System.out.println(contrycode);
		}
	}
}