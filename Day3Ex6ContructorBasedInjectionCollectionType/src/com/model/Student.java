package com.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	private List<String> cities;
	private Set<Long> mobiles;
	private Map<String,Integer> contycode;
	public Student(List<String> cities, Set<Long> mobiles, Map<String, Integer> contycode) {
		super();
		this.cities = cities;
		this.mobiles = mobiles;
		this.contycode = contycode;
	}
	@Override
	public String toString() {
		return "Student [cities=" + cities + ", mobiles=" + mobiles + ", contycode=" + contycode + "]";
	}
	
	


	

}
