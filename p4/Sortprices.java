package p4;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import p4.ElectronicDevice;
import p4.Laptop;
import p4.Camera;
import p4.Computer;
import p4.TV;

public class Sortprices {
	
	public static void main(String[] args)
	{
		
		Map<String, List<ElectronicDevice>> elecMap = new HashMap<>();
		
		
		ElectronicDevice d1 = new Laptop(1, 25,"HP","Black",15000, 10, false);
		ElectronicDevice d2 = (new Laptop(2, 12,"ASUS","Blue",45000, 16, true));
		ElectronicDevice d3 = (new Laptop(3,15,"Lenovo","Silver",30000, 8, true));
		
		List<ElectronicDevice> LaptopList = new ArrayList<>();
		LaptopList.add(d1);
		LaptopList.add(d2);
		LaptopList.add(d3);
	
		
		ElectronicDevice d4 = (new Computer(4,15,"DELL","silver",30000, 8, false));
		ElectronicDevice d5 = (new Computer(5, 20,"HP","gray",20000, 8, true));
		ElectronicDevice d6 = (new Computer(6, 15,"Mac","black",15000, 16, true));
		
		List<ElectronicDevice> CompList = new ArrayList<>();
		CompList.add(d4);
		CompList.add(d5);
		CompList.add(d6);
		
		ElectronicDevice d7 = (new Camera(7, 10,"Canon","black",4000, 32, true));
		ElectronicDevice d8 = (new Camera(8, 8,"Sony","white",15000, 16, true));
		ElectronicDevice d9 = (new Camera(9, 12,"Nikon","black",8000, 8, false));
		
		List<ElectronicDevice> CameraList = new ArrayList<>();
		CameraList.add(d7);
		CameraList.add(d8);
		CameraList.add(d9);
		
		ElectronicDevice d10 = (new TV(10,46,"Sony","white",40000, 16, false));
		ElectronicDevice d11 = (new TV(11,32,"mi","black",25000, 8, true));
		ElectronicDevice d12 = (new TV(12,46,"lg","black",30000, 4, false));
		
		List<ElectronicDevice> TVList = new ArrayList<>();
		TVList.add(d10);
		TVList.add(d11);
		TVList.add(d12);
		
		elecMap.put("Laptop", LaptopList);
		elecMap.put("Computer", CompList);
		elecMap.put("Camera", CameraList);
		elecMap.put("TV", TVList);
		
		Iterator<String> itr = elecMap.keySet().iterator();
		
		while(itr.hasNext())
		{
			String Elecname = itr.next();
			
			if(Elecname.equals("Computer"))
			{
				List<ElectronicDevice> elecdevices = elecMap.get(Elecname);
				
				for(ElectronicDevice elecdevice: elecdevices) {
					if(elecdevice.getPrice()>=5000 && elecdevice.getPrice()<=20000)
							{
								System.out.println(elecdevice.getBrandname()+" "+elecdevice);
							}
				}
			}
		}
		
	}
	
}
