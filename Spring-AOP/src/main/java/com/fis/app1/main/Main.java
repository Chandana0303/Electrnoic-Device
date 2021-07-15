package com.fis.app1.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import com.fis.app1.model.Client;
import com.fis.app1.service.ClientService;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fis.app1.model.ElectronicDevice;

public class Main {

	public static void main(String[] args) {
		
		// Spring container 

		ClassPathXmlApplicationContext spring = new ClassPathXmlApplicationContext("my_project.xml");
		ClientService clientService = (ClientService)spring.getBean("clientService");
		
		System.out.println("-------------Order---------");
		clientService.doOrder();
		
		
		
	}
	

}
