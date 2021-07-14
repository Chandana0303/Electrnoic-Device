package com.fis.app1.model;

public class Mobile {
	
	public String devicetype;
	public boolean bluetooth;
	
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mobile(String devicetype, boolean bluetooth) {
		super();
		this.devicetype = devicetype;
		this.bluetooth = bluetooth;
	}

	
	public String getDevicetype() {
		return devicetype;
	}

	public void setDevicetype(String devicetype) {
		this.devicetype = devicetype;
	}

	public boolean isBluetooth() {
		return bluetooth;
	}

	public void setBluetooth(boolean bluetooth) {
		this.bluetooth = bluetooth;
	}

	@Override
	public String toString() {
		return "Mobile [devicetype=" + devicetype + ", bluetooth=" + bluetooth + "]";
	}
	
	

}
