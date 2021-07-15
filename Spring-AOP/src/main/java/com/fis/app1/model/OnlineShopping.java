package com.fis.app1.model;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OnlineShopping {
	
	//@Autowired
	private ElectronicDevice device;
	private String websitename;
	
	
	OnlineShopping() {
		super();
		// TODO Auto-generated constructor stub
	}


	OnlineShopping(ElectronicDevice device, String websitename) {
		super();
		this.device = device;
		this.websitename = websitename;
	}


	public ElectronicDevice getDevice() {
		return device;
	}


	public void setDevice(ElectronicDevice device) {
		this.device = device;
	}


	public String getWebsitename() {
		return websitename;
	}


	public void setWebsitename(String websitename) {
		this.websitename = websitename;
	}


	@Override
	public int hashCode() {
		return Objects.hash(device, websitename);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OnlineShopping other = (OnlineShopping) obj;
		return Objects.equals(device, other.device) && Objects.equals(websitename, other.websitename);
	}


	@Override
	public String toString() {
		return "OnlineShopping [device=" + device + ", websitename=" + websitename + "]";
	}
	
	

}
