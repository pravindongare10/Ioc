package com.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	
	private int id;
	private String name;
	@Autowired
	private Address ad;
	public Address getAd() {
		return ad;
	}
	public void setAd(Address ad) {
		this.ad = ad;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
