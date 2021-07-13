package com.fis.app.dao;

import java.util.List;
import java.sql.SQLException;
import com.fis.app.exce.NoDeviceFoundException;
import com.fis.app.model.ElectronicDevice;

public interface IElectronicDeviceDAO {

	
	public boolean addDevice(ElectronicDevice device);
	public List<ElectronicDevice> getAllDevices();
	
	public boolean changeDevicePrice(int deviceId,int newPrice)throws NoDeviceFoundException;
	public boolean changeDeviceRating(int deviceId,int newRating)throws NoDeviceFoundException;
	
	public boolean deleteDevice(int deviceId)throws NoDeviceFoundException;
	
	public List<ElectronicDevice> getDevicesBasedOnBrandNameAndType(String brandName,String type);
	public int countDeviceType(String type);
	public int getSumofPriceBasedOnType(String type);
	
	public List<ElectronicDevice> getDeviceBasedOnPriceRangeAndType(int range1,int range2,String type,List<ElectronicDevice> ls);
	
}
