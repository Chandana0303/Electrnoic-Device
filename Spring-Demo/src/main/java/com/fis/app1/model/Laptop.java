package com.fis.app1.model;

public class Laptop {

	public String laptopbrand;
	public String ramsize;
	Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	Laptop(String laptopbrand, String ramsize) {
		super();
		this.laptopbrand = laptopbrand;
		this.ramsize = ramsize;
	}

	public String getLaptopbrand() {
		return laptopbrand;
	}

	public void setLaptopbrand(String laptopbrand) {
		this.laptopbrand = laptopbrand;
	}

	public String getRamsize() {
		return ramsize;
	}

	public void setRamsize(String ramsize) {
		this.ramsize = ramsize;
	}

	@Override
	public String toString() {
		return "Laptop [laptopbrand=" + laptopbrand + ", ramsize=" + ramsize + "]";
	}
	
	
	
	
}
