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
		System.out.println(id);
		System.out.println(name);
		System.out.println(adr);
	}
	
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", adr=" + adr + "]";
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
	public String getAdr() {
		return adr;
	}
	public void setAdr(String adr) {
		this.adr = adr;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	

}
