package p4;

public class ElectronicDevice implements Comparable<ElectronicDevice>{
	private int serialno;
	private int screensize;
	private String brandname;
	private String colour;
	private int price;
	
	public ElectronicDevice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ElectronicDevice(int serialno, int screensize, String brandname, String colour,int price) {
		super();
		this.serialno = serialno;
		this.screensize = screensize;
		this.brandname = brandname;
		this.colour = colour;
		this.price = price;
	}
	
	public int getSerialno() {
		return serialno;
	}
	public void setSerialno(int serialno) {
		this.serialno = serialno;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public int compareTo(ElectronicDevice o) {
		// TODO Auto-generated method stub
		return this.getBrandname().compareTo(o.getBrandname());
	}

	@Override
	public String toString() {
		return "ElectronicDevice [price=" + price + "]";
	}
	
	
	
	
	
}
