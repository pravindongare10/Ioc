package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.model.Address;
import com.model.Student;

@Configuration
public class AppConfig {
	@Bean(name = "s")
	public Student s1() {
		Student s=new Student();
		s.setId(1);
		s.setName("Pravin");
		return s;
	}

	@Bean()
	public Address ad() {
		Address d=new Address();
		d.setAreaname("Pangari");
		d.setCityname("kotul");
		return d;
	}
		
	
}
