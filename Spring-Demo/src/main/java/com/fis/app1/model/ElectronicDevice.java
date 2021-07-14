package com.fis.app1.model;

import java.util.Objects;
import java.io.Serializable;

public class ElectronicDevice implements Serializable,Comparable<ElectronicDevice>{

	private int serialno;
	private String brandname;
	private String colour;
	private int price;
	private Laptop l;
	private Mobile m;
	
	ElectronicDevice() {
		super();
		// TODO Auto-generated constructor stub
	}


	ElectronicDevice(int serialno, String brandname, String colour, int price) {
		super();
		this.serialno = serialno;
		this.brandname = brandname;
		this.colour = colour;
		this.price = price;
	}

		
	public Mobile getM() {
		return m;
	}


	public void setM(Mobile m) {
		this.m = m;
	}


	public Laptop getL() {
		return l;
	}


	public void setL(Laptop l) {
		this.l = l;
	}


	public int getSerialno() {
		return serialno;
	}


	public void setSerialno(int serialno) {
		this.serialno = serialno;
	}


	public String getBrandname() {
		return brandname;
	}


	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public int hashCode() {
		return Objects.hash(brandname, colour, price, serialno);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ElectronicDevice other = (ElectronicDevice) obj;
		return Objects.equals(brandname, other.brandname) && Objects.equals(colour, other.colour)
				&& price == other.price && serialno == other.serialno;
	}


	@Override
	public String toString() {
		if(l==null)
		{
		return "ElectronicDevice [serialno=" + serialno + ", brandname=" + brandname + ", colour=" + colour + ", price="
				+ price + "]";
		}
		return serialno+"-"+brandname+"-"+colour+"-"+l.getDevicetype()+"-"+l.getRamsize()+"-"+price;
	}
	
	

	@Override
	public int compareTo(ElectronicDevice device) {
		// TODO Auto-generated method stub
		return this.brandname.compareTo(device.brandname);
	}
	
	
	
}
