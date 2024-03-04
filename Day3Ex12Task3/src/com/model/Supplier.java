package com.model;

import java.util.List;

public class Supplier {
	private int supid;
	private String supname;
	private long supmobno;
	private List cities;
	public int getSupid() {
		return supid;
	}
	public void setSupid(int supid) {
		this.supid = supid;
	}
	public String getSupname() {
		return supname;
	}
	public void setSupname(String supname) {
		this.supname = supname;
	}
	public long getSupmobno() {
		return supmobno;
	}
	public void setSupmobno(long supmobno) {
		this.supmobno = supmobno;
	}
	public List getCities() {
		return cities;
	}
	public void setCities(List cities) {
		this.cities = cities;
	}

}
