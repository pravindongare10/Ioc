package com.model;

import java.util.List;
import java.util.Map;

public class Product {
	private int proid;
	private String proname;
	private double proprice;
	private List<Dealer>ld;
	private Map<Integer,Supplier>ms;
	public int getProid() {
		return proid;
	}
	public void setProid(int proid) {
		this.proid = proid;
	}
	public String getProname() {
		return proname;
	}
	public void setProname(String proname) {
		this.proname = proname;
	}
	public double getProprice() {
		return proprice;
	}
	public void setProprice(double proprice) {
		this.proprice = proprice;
	}
	public List<Dealer> getLd() {
		return ld;
	}
	public void setLd(List<Dealer> ld) {
		this.ld = ld;
	}
	public Map<Integer, Supplier> getMs() {
		return ms;
	}
	public void setMs(Map<Integer, Supplier> ms) {
		this.ms = ms;
	}

}
