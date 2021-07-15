package com.fis.app1.client;

import org.springframework.context.ApplicationContext;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fis.app1.model.ElectronicDevice;

public class Main {

	public static void main(String[] args) {
		
		// Spring container 
		ClassPathXmlApplicationContext spring = new ClassPathXmlApplicationContext("my_project.xml");
		ElectronicDevice elec = (ElectronicDevice)spring.getBean("electronicDevice");
		System.out.println(elec);
		
		spring.close();
		
	}
	

}
