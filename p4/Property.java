package p4;

public class Property {
	private int memory;
	private boolean bluetooth;
	public Property() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Property(int memory, boolean bluetooth) {
		super();
		this.memory = memory;
		this.bluetooth = bluetooth;
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
	public int calcPower(int memo)
	{
		return memo+(memo/10);
	}
	
	
}
