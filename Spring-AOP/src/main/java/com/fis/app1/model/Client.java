package com.fis.app1.model;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;

@Component
public class Client {
	
	@Value("Ram")
	public String customer_name;
	@Value("9714261862")
	public String phone_no;

	Client() {
		super();
		// TODO Auto-generated constructor stub
	}


	Client(String customer_name,String phone_no) {
		super();
		this.customer_name = customer_name;
		this.phone_no = phone_no;
	}

	

	public String getCustomer_name() {
		return customer_name;
	}


	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}


	public String getPhone_no() {
		return phone_no;
	}


	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}


	@Override
	public String toString() {
		return "Client [customer_name=" + customer_name + ", phone_no=" + phone_no + "]";
	}


	
	

}
