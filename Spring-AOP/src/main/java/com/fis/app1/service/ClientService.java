package com.fis.app1.service;

import org.springframework.stereotype.Component;

import com.fis.app1.util.LoggingClass;
import com.fis.app1.util.SecurityClass;

@Component
public class ClientService {
	
	public void doOrder()
	{
		System.out.println("-------------making an order----------");
	}

	
	public void doPayment(String payment_type)
	{
		System.out.println("--------------making payment----------"+payment_type);
	}

	
}
