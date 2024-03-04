package com.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	private List<Address> cities;
	private Set<Long> mobiles;
	private Map<Integer,Address> contrycode;
	public List<Address> getCities() {
		return cities;
	}
	public void setCities(List<Address> cities) {
		this.cities = cities;
	}
	public Set<Long> getMobiles() {
		return mobiles;
	}
	public void setMobiles(Set<Long> mobiles) {
		this.mobiles = mobiles;
	}
	public Map<Integer, Address> getContrycode() {
		return contrycode;
	}
	public void setContrycode(Map<Integer, Address> contrycode) {
		this.contrycode = contrycode;
	}


	
}
