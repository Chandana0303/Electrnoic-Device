package com.fis.app.exce;

public class NoDeviceFoundException extends Exception {

	private int id;
	private String type;
	
	/*public NoDeviceFoundException(int id)
	{
		this.id = id;
	}*/
	
	public NoDeviceFoundException(String type)
	{
		this.type=type;
	}

	public String toString() {
		return "Invalid devicetype:"+type;
	}
	
	
}
