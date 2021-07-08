package p3;

public class Main {
	
	public static void main(String[] args)
	{

		Computer pc = new Computer(25,"HP","Black",16,true);
		Laptop abc = new Laptop(15,"DELL","silver",8,false);
		Camera cam = new Camera(10,"Canon","black",32,true);
		TV tv = new TV(46,"Sony","white",4,false);
		
		System.out.println("Power:"+ pc.getPower());
		System.out.println("Power:"+ abc.getPower());
		System.out.println("Power:"+ cam.getPower());
		System.out.println("Power:"+ tv.getPower());
		System.out.println(pc.getBrandname());
	
	}

}
