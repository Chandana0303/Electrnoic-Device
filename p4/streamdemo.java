package p4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import p4.ElectronicDevice;

public class streamdemo {
	
public static void main(String[] args)
		{
			//minOrMax();
			//minOrmaxOfprice();
		dofilter();
	}

public static void minOrmaxOfprice()
{
	ElectronicDevice d1 = new Laptop(1, 25,"HP","Black",15000, 10, false);
	ElectronicDevice d2 = (new Laptop(2, 12,"ASUS","Blue",45000, 16, true));
	ElectronicDevice d3 = (new Laptop(3,15,"Lenovo","Silver",30000, 8, true));
			
			List<ElectronicDevice> devlist = Arrays.asList(d1,d2,d3);
	
			Comparator<ElectronicDevice> priceComparator = (arg0,arg1)->
			{
				return arg0.getPrice() - arg1.getPrice();
			};
			
			Optional<ElectronicDevice> optional = devlist.stream().min(priceComparator);
			ElectronicDevice e = optional.get();
			System.out.println(e.getPrice());
			
			Optional<ElectronicDevice> optional1 = devlist.stream().max(priceComparator);
			ElectronicDevice e1 = optional1.get();
			System.out.println(e1.getPrice());
			
			
}

public static void dofilter()
{

	ElectronicDevice d1 = new Laptop(1, 25,"HP","Black",15000, 10, false);
	ElectronicDevice d2 = (new Laptop(2, 12,"ASUS","Blue",45000, 16, true));
	ElectronicDevice d3 = (new Laptop(3,15,"Lenovo","Silver",30000, 8, true));
	ElectronicDevice d4 = new Laptop(4, 25,"HP","Silver",10000, 10, true);
	
	List<ElectronicDevice> devlist = Arrays.asList(d1,d2,d3,d4);
	
	Comparator<ElectronicDevice> priceComparator = (arg0,arg1)->
	{
		return arg0.getPrice() - arg1.getPrice();
	};
	
	
	ElectronicDevice e = devlist.stream().
		    filter(arg0->{
		    			String ed = arg0.getBrandname();
		    			//String projectName = project.getProjectName();
		    			//System.out.println(ed.equals("ASUS"));
		    			return ed.equals("HP");
		    			 }).
		    min(priceComparator).
		    get();
			System.out.println(e);
	
			List<ElectronicDevice> empBasedOnSalaryList = 
					devlist.stream().
				    filter(arg0->{
				    	String ed = arg0.getBrandname();
				    	
				    	return ed.equals("HP");
				    			 }).
				    collect(Collectors.toList());
				
	}
}


