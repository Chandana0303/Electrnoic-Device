package com.fis.app;

import java.util.List;

import com.fis.app.dao.ElectronicDeviceDAOImpl;
import com.fis.app.dao.IElectronicDeviceDAO;
import com.fis.app.exce.NoDeviceFoundException;
import com.fis.app.model.ElectronicDevice;

public class UserCode {
	
	public static void main(String[] args) {
		
		IElectronicDeviceDAO dev = new ElectronicDeviceDAOImpl();
		/*System.out.println("===================Insert device details============\n");
		ElectronicDevice testemployee = new ElectronicDevice("Mobile",2,"MI",10000,300,4,"Gray");
		ElectronicDevice testemployee3 = new ElectronicDevice("Laptop",5,"DELL",25000,350,4,"White");
		boolean test = dev.addDevice(testemployee3);
		System.out.println(test);
		System.out.println("====================Device inserted===============");*/
		
		
		
		/*System.out.println("==============Get all device details============");
		List<ElectronicDevice> list = dev.getAllDevices();
		list.stream().forEach((device)->System.out.println(device));*/
		
		
		
		/*List<ElectronicDevice> device1 = dev.getDevicesBasedOnBrandNameAndType("Oneplus", "Mobile");
		System.out.println(device1);*/
		
		
		//System.out.println(device1);
		
		/*try {
			System.out.println(dev.changeDevicePrice(2, 12000));
		} 
		catch (NoDeviceFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}*/
		
		/*try {
			System.out.println(dev.changeDeviceRating(3, 3));
		} catch (NoDeviceFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		System.out.println(dev.countDeviceType("Laptop"));*/
		
		
		/*try {
			System.out.println(dev.deleteDevice(1));
		} catch (NoDeviceFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}*/
		
		System.out.println(dev.getSumofPriceBasedOnType("Mobile"));
		
		
		
	}

}
