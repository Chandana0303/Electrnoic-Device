package p4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import p4.ElectronicDevice;
import p4.Laptop;
import p4.Camera;
import p4.Computer;
import p4.TV;

public class Sortdevices {
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		/*Set<ElectronicDevice> elecSet = getdata();
		
		
		
		List<ElectronicDevice> devicebasedlist = new ArrayList<>();
		devicebasedlist.addAll(elecSet);
		String sa[] = { "Laptop", "Computer", "Camera", "TV" };
		
		for(int i =0; i<sa.length; i++)
		{
			List<ElectronicDevice> device = new ArrayList<>();
			
			for(ElectronicDevice devicebasedList : devicebasedlist)
			{
				System.out.println(devicebasedList.getClass().getSimpleName()+" "+sa[i]);
				if(sa[i]==(devicebasedlist.getClass().getSimpleName()))
				{
					System.out.println("hello world");
					device.add(devicebasedList);
				}
			}
			System.out.println("Device before sorting: "+sa[i]);
			doPrint(device,"Default data rendering");
			Collections.sort(device, new SortDevicesBasedOnPrice());
			doPrint(device,"Sort Data Based On Price: "+sa[i]);
		}
		
		
	}
	
	public static Set<ElectronicDevice> getdata()
	{*/
		Set<ElectronicDevice> elecSet =  new TreeSet();
		elecSet.add(new Laptop(1,25,"HP","Black",15000, 10, false));
		elecSet.add(new Laptop(2,12,"ASUS","Blue",45000, 16, true));
		elecSet.add(new Laptop(3,16,"Lenovo","Silver",30000, 8, true));
		
		elecSet.add(new Computer(4,15,"DELL","silver",30000, 8, false));
		elecSet.add(new Computer(5,20,"HP","gray",20000, 8, true));
		elecSet.add(new Computer(6,15,"Mac","black",15000, 16, true));
		
		elecSet.add(new Camera(7,10,"Canon","black",4000, 32, true));
		elecSet.add(new Camera(8,8,"Sony","white",15000, 16, true));
		elecSet.add(new Camera(9,12,"Nikon","black",8000, 8, false));
		
		elecSet.add(new TV(10,46,"Sony","white",40000, 16, false));
		elecSet.add(new TV(11,32,"mi","black",25000, 8, true));
		elecSet.add(new TV(12, 46,"lg","black",30000, 4, false));
		
		/*return(elecSet);*/
		
		doPrint(elecSet,"Default data rendering");
		
		List<ElectronicDevice> pricebasedlist = new ArrayList<>();
		pricebasedlist.addAll(elecSet);
		
		Collections.sort(pricebasedlist, new SortDevicesBasedOnPrice());
		doPrint(pricebasedlist,"Data after sorting");
		
	}
		
	public static void doPrint(Collection<ElectronicDevice> collection,String tagline)
	{
		
		System.out.println("\n\n ==========="+tagline+"=======================\n");
		for(ElectronicDevice elecdevice: collection)
		{
			System.out.println(elecdevice.getSerialno()+":"+elecdevice);
		}
	}
	
	
	
}
