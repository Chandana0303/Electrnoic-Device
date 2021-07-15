package com.fis.app1.model;

import java.io.File;

import java.io.PrintWriter;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ElectronicDevice implements Serializable,Comparable<ElectronicDevice>{

	@Value("${elec.serialno}")
	private int serialno;
	@Value("${elec.brandname}")
	private String brandname;
	@Value("${elec.colour}")
	private String colour;
	@Value("#{new Integer('${elec.price}')}")
	private int price;
	private Laptop l;
	private Mobile m;
	private File f;
	
	@Autowired
	private List<Port> ports;
	
	ElectronicDevice() {
		super();
		// TODO Auto-generated constructor stub
	}

		
	ElectronicDevice(int serialno, String brandname, String colour, int price,  List<Port> ports) {
		super();
		this.serialno = serialno;
		this.brandname = brandname;
		this.colour = colour;
		this.price = price;
		this.ports = ports;
	}

	

	public List<Port> getPorts() {
		return ports;
	}


	public void setPorts(List<Port> ports) {
		this.ports = ports;
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
				+ price +"ports=" + ports + "]";
		}
		return serialno+"-"+brandname+"-"+colour+"-"+l.getDevicetype()+"-"+l.getRamsize()+"-"+price+"-"+ports;
	}
	

	@Override
	public int compareTo(ElectronicDevice device) {
		// TODO Auto-generated method stub
		return this.brandname.compareTo(device.brandname);
	}


	public void doInIt()
	{
		System.out.println("do init called");
		try {
			f = new File("C:\\Users\\User\\Documents\\workspace-spring-tool-suite-4-4.11.0.RELEASE\\Spring-Demo\\src\\main\\resources\\new.txt");
				
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public void doDestroy()
	{
		System.out.println("do destroy called");
		try {
			PrintWriter pw = new PrintWriter(f);
			pw.write(getSerialno()+"-"+getBrandname()+"-"+getColour()+"-"+getPrice()+"-"+getPorts());
			pw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
