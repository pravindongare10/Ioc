 package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Product;

public class Test {

	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("bean.xml");
		
		Product p=a.getBean("s3",Product.class);
		System.out.println(p.getProid());
		System.out.println(p.getProname());
		System.out.println(p.getProprice());
		System.out.println(p.getSupid());
		System.out.println(p.getSupname());
		System.out.println(p.getSupmobno());
		System.out.println(p.getCities());
		
		
	}
}