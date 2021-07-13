package com.fis.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.fis.app.exce.NoDeviceFoundException;
import com.fis.app.model.ElectronicDevice;

public class ElectronicDeviceDAOImpl implements IElectronicDeviceDAO {
	
	Connection con = null;

	String insertDeviceQuery = "insert into electronicdevice.devices values(?,?,?,?,?,?,?)";
	String selectAllDevices = "select * from electronicdevice.devices";
	String updateDeviceprice = "update electronicdevice.devices set cost= ? where deviceid = ?";
	String updateDevicerating = "update electronicdevice.devices set starRatings= ? where deviceid = ?";
	String deleteDeviceQuery = "delete from electronicdevice.devices where deviceid= ?";
	String selectDeviceBasedOnBrandnameandType = "select * from electronicdevice.devices where devicetype = ? AND brandname = ?";
	String countDevicesQuery = "select devicetype,count(devicetype) as Count from electronicdevice.devices where devicetype= ? group by devicetype";
	String sumOfPriceQuery = "select sum(cost) from electronicdevice.devices where devicetype = ? group by devicetype";
	
	@Override
	public boolean addDevice(ElectronicDevice device){
		con = DataUtil.getConnection();
		boolean isInserted = false;
		if (con != null) {

			// Step1 : extract employee details from e object
			int id = device.getDeviceId();
			String type = device.getDeviceType();
			String brandname = device.getBrandName();
			int price = device.getCost();
			int power = device.getPower();
			int rating = device.getStarRatings();
			String color = device.getColor();

			// Step 2 :- write the code to create complete insert Query with data
			PreparedStatement ps;
			try {
				ps = con.prepareStatement(insertDeviceQuery);
				ps.setInt(1, id);
				ps.setString(2, type);
				ps.setString(3, brandname);
				ps.setInt(4,price);
				ps.setInt(5,power);
				ps.setInt(6,rating);
				ps.setString(7, color);

				// Step 3 : execute Query
				int i = ps.executeUpdate(); // only works with insert , update & delete

				if (i > 0)
					isInserted = true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
			

		}
		return isInserted;
	}
	
	@Override
	public List<ElectronicDevice> getAllDevices() {
		con = DataUtil.getConnection();
		List<ElectronicDevice> deviceList = new ArrayList<>();
		if (con != null) {

			PreparedStatement ps;
			try {
				ps = con.prepareStatement(selectAllDevices);
				
				ResultSet rs = ps.executeQuery();

				while (rs.next()) {
					ElectronicDevice temp = new ElectronicDevice(); // default emp,

					temp.setDeviceId(rs.getInt(1));
					temp.setDeviceType(rs.getString("devicetype"));
					temp.setBrandName(rs.getString("brandname"));
					temp.setCost(rs.getInt("cost"));
					temp.setPower(rs.getInt("power"));
					temp.setStarRatings(rs.getInt("starRatings"));
					temp.setColor(rs.getString("color"));

					deviceList.add(temp);
				}
			} 
			catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		}
		return deviceList;
	}
	
	
	@Override
	public boolean changeDevicePrice(int deviceId, int newPrice) throws NoDeviceFoundException {
		con = DataUtil.getConnection();
		boolean isUpdated = false;
		if (con != null) {

			PreparedStatement ps;
			try {
				ps = con.prepareStatement(updateDeviceprice);
				ps.setInt(1, newPrice);
				ps.setInt(2, deviceId);


				int i = ps.executeUpdate(); 
				if (i > 0)
					isUpdated = true;

				return isUpdated;

			} 
			catch (SQLException e) {

				System.out.println("\n========Invalid Data Entered========\n");
			}
		}
		return isUpdated;
		}
		
	
	
	@Override
	public boolean changeDeviceRating(int deviceId, int newRating) throws NoDeviceFoundException {
		con = DataUtil.getConnection();
		boolean isUpdated = false;
		if (con != null) {

			// Step 2 :- write the code to create complete insert Query with data
			PreparedStatement ps;
				try {
					ps = con.prepareStatement(updateDevicerating);
					ps.setInt(1, deviceId);
					ps.setInt(2,newRating);

					// Step 3 : execute Query
					int i = ps.executeUpdate(); // only works with insert , update & delete

					if (i > 0)
						isUpdated = true;
					
					return isUpdated;
				} 
				catch (SQLException e) {
					// TODO Auto-generated catch block
					System.out.println(e);
				}
			} 
		return isUpdated;
	}
	
	
	@Override
	public boolean deleteDevice(int deviceId) throws NoDeviceFoundException {
		con = DataUtil.getConnection();
		boolean isDeleted = false;
		if (con != null) {

			// Step 2 :- write the code to create complete insert Query with data
			PreparedStatement ps;
				try {
					ps = con.prepareStatement(deleteDeviceQuery);
					ps.setInt(1, deviceId);

					// Step 3 : execute Query
					int i = ps.executeUpdate(); // only works with insert , update & delete

					if (i > 0)
						isDeleted = true;
				} 
				catch (SQLException e) {
					// TODO Auto-generated catch block
					System.out.println(e);
				}
			} 
		return isDeleted;
	}
	
	@Override
	public List<ElectronicDevice> getDevicesBasedOnBrandNameAndType(String brandName, String type) {
		con = DataUtil.getConnection();
		List<ElectronicDevice> DevList = new ArrayList<>();
		if (con != null) {

			PreparedStatement ps;
			try {
				ps = con.prepareStatement(selectDeviceBasedOnBrandnameandType);
				ps.setString(1, type);
				ps.setString(2, brandName);

				ResultSet rs = ps.executeQuery();
				boolean isFound = false;
				while (rs.next()) {
					isFound = true;
					ElectronicDevice temp = new ElectronicDevice();

					temp.setDeviceId(rs.getInt("deviceid"));
					temp.setDeviceType(rs.getString("deviceType"));
					temp.setBrandName(rs.getString("brandName"));
					temp.setCost(rs.getInt("cost"));
					temp.setPower(rs.getInt("power"));
					temp.setStarRatings(rs.getInt("starRatings"));
					temp.setColor(rs.getString("color"));

					DevList.add(temp);
				} 
			}
			catch (SQLException e) {
				System.out.println("\n========Invalid Data Entered========\n");
			}

		}
		return DevList;
}
	
	
	@Override
	public int countDeviceType(String type) {
		con = DataUtil.getConnection();
		int count = 0;
		if (con != null) {
			
			try {
				PreparedStatement ps = con.prepareStatement(countDevicesQuery);
				ps.setString(1, type);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					count =rs.getInt(2);
				}
			}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
			}

		return count;
		
	}
	
	
	@Override
	public int getSumofPriceBasedOnType(String type) {
		con = DataUtil.getConnection();
		int sum = 0;
		if (con != null) {
			try {
				PreparedStatement ps = con.prepareStatement(sumOfPriceQuery);
				ps.setString(1, type);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					sum = rs.getInt("SUM(cost)");
				}
			} 
			catch (SQLException e) {
				System.out.println("\n========Invalid Data Entered========\n");
			}
		}
		return sum;
	}

	@Override
	public List<ElectronicDevice> getDeviceBasedOnPriceRangeAndType(int range1, int range2, String type,List<ElectronicDevice> ls) {
		// TODO Auto-generated method stub
		ls = ls.stream().filter(ed1->{
			return ed1.getDeviceType().equals(type) && ed1.getCost() >= range1 && ((ElectronicDevice) ed1).getCost() <=2;	
		}).collect(Collectors.toList());
	return ls;
	}

	
}
