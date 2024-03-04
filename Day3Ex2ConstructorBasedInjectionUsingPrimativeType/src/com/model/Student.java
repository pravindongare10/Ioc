package com.model;

public class Student {
	
	private int id;
	private String name;
	private String adr;
	public Student(int id, String name, String adr) {
		super();
		this.id = id;
		this.name = name;
		this.adr = adr;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", adr=" + adr + "]";
	}


}
