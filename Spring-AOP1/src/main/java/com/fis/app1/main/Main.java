package com.fis.app1.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.fis.app1.model.Client;
import com.fis.app1.service.ClientService;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.fis.app1.model.ElectronicDevice;

public class Main {
	
	
	public static void main(String[] args) {
		
		// Spring container 

		ApplicationContext spring = new ClassPathXmlApplicationContext("my_project.xml");
		ClientService clientService = (ClientService)spring.getBean("clientService");
		
		System.out.println("-------------Order---------");
		clientService.doOrder();
		
		System.out.println(" ");
		System.out.println("-------------Payment---------");
		clientService.doPayment();
		
		System.out.println(" ");
		System.out.println("-------------Payment---------");
		clientService.doPayment("Paytm");
		
		
	}
	

}
