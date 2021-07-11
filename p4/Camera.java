package p4;

public class Camera extends ElectronicDevice{
	
	public int memory;
	public boolean bluetooth;
	public int power;
	
	Property prop = new Property();

	public Camera() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Camera(int serialno, int screensize, String brandname, String colour,int price,int memory,boolean bluetooth) {
		super(serialno,screensize, brandname, colour, price);
		// TODO Auto-generated constructor stub
		this.memory=memory;
		this.bluetooth =bluetooth;
		this.power=prop.calcPower(memory);
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public boolean isBluetooth() {
		return bluetooth;
	}

	public void setBluetooth(boolean bluetooth) {
		this.bluetooth = bluetooth;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	

}
