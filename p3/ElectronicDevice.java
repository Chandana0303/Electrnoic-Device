package p3;

public class ElectronicDevice {
	private int screensize;
	private String brandname;
	private String colour;
	public ElectronicDevice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ElectronicDevice(int screensize, String brandname, String colour) {
		super();
		this.screensize = screensize;
		this.brandname = brandname;
		this.colour = colour;
	}
	public int getScreensize() {
		return screensize;
	}
	public void setScreensize(int screensize) {
		this.screensize = screensize;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	
	
}
