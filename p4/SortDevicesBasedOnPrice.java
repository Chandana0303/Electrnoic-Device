package p4;

import java.util.Comparator;

import p4.ElectronicDevice;

public class SortDevicesBasedOnPrice implements Comparator<ElectronicDevice> {

	@Override
	public int compare(ElectronicDevice arg0, ElectronicDevice arg1) {
		// TODO Auto-generated method stub
		return arg0.getPrice() - arg1.getPrice();
	}
	

}
