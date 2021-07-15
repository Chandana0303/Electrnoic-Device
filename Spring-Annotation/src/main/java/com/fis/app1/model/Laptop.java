package com.fis.app1.model;

import org.springframework.stereotype.Component;

@Component

public class Laptop {

	public String devicetype;
	public String ramsize;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Laptop(String devicetype, String ramsize) {
		super();
		this.devicetype = devicetype;
		this.ramsize = ramsize;
	}

	

	public String getDevicetype() {
		return devicetype;
	}

	public void setDevicetype(String devicetype) {
		this.devicetype = devicetype;
	}

	public String getRamsize() {
		return ramsize;
	}

	public void setRamsize(String ramsize) {
		this.ramsize = ramsize;
	}

	@Override
	public String toString() {
		return "Laptop [devicetype=" + devicetype + ", ramsize=" + ramsize + "]";
	}
	
	
	
	
}
