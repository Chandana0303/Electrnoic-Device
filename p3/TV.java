package p3;

public class TV extends ElectronicDevice{

	public int memory;
	public boolean bluetooth;
	public int power;
	
	Property prop = new Property();

	public TV() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TV(int screensize, String brandname, String colour,int memory,boolean bluetooth) {
		super(screensize, brandname, colour);
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
