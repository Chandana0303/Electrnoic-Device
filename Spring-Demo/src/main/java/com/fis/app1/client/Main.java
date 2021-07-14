package com.fis.app1.client;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fis.app1.model.ElectronicDevice;

public class Main {

	public static void main(String[] args) {
		
		// Spring container 
		ApplicationContext spring = new ClassPathXmlApplicationContext("my_project.xml");
		ElectronicDevice device = (ElectronicDevice)spring.getBean("newdevice1");
		System.out.println(device);
		
		ElectronicDevice device1 = (ElectronicDevice)spring.getBean("newdevice2");
		System.out.println(device1);
		
	}


}
