package day4;

import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

public class SerializationDemo {

	String basepath = "C:\\Users\\User\\demo";
	String fileName = "oldapproach.txt";
	String fileName2 = "SerApproach.txt";
	
	
	public static void main(String[] args) {
		
		SerializationDemo obj = new SerializationDemo();
		try {
			//obj.oldApproach();
			List<Account> listacc = new ArrayList<>();
			String filePath = obj.basepath+""+obj.fileName2;
			
			Account a = new Account(101, "Ramesh", 2000);
			File serFile = new File(filePath);
			listacc.add(new Account(102,"jhon",4000));
			listacc.add(new Account(103,"suresh",2500));
			listacc.add(new Account(104,"mike",6000));
			obj.saveSerializableAccount(serFile,a,listacc);
			
			obj.readSerializableAccount(serFile);
		
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	
	public void saveSerializableAccount(File serfile,Account account,List<Account> acc) throws Exception
	{
		
		FileOutputStream fos = new FileOutputStream(serfile);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(acc);  // List<Account>
		oos.close();
		
	}
	
	public void readSerializableAccount(File serfile) throws Exception
	{
		 FileInputStream fis = new FileInputStream(serfile);
		 ObjectInputStream ois = new ObjectInputStream(fis);
		 
		 ArrayList<Account>  list = (ArrayList<Account>)  ois.readObject();
		 //// read List<Account> balance based on r1-r2
		// Account account = (Account)ois.readObject(); 
		 // List<Account> list = (List<Account>) ois.readObject();
		 for(Account acc: list)
		 {
			 if(acc.getBalance()>=1500 && acc.getBalance()<=7000)
				 System.out.println(acc.getAccountHolderName()+"-"+acc.getAccountNumber()+"-"+acc.getBalance());
		 }
		 
		 
		 
		 
	}
	
	
	
	public void oldApproach() throws Exception// working with data
	{
		File f = new File(basepath+""+fileName);
		PrintWriter pw = new PrintWriter(new FileWriter(f,true));
		
		Account a = new Account(101, "Ramesh", 2000);
		// cannot work with Object
		//pw.append(a); // error
		pw.append(a.getAccountNumber()+" - "+a.getAccountHolderName()+" - "+a.getBalance());
		pw.close();
	}

}//end class
