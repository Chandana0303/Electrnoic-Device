package day4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileHandlingDemo {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\User\\Documents\\workspace-spring-tool-suite-4-4.11.0.RELEASE\\JavaDemo1\\src\\p4\\Laptop.java";
		int count = 0;
		String[] buffer;
		try {
		
			File f = new File(path);
			new FileHandlingDemo().readFile(f);
			
			
		} catch (Exception e) {
				System.out.println(e);
		}
		
	}//end main
	
	
	public void readFile(File f)throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader(f));
	
		String line = null;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the word to be searched:");
		String word = sc.nextLine();
		int count = 0;
		System.out.println("line number");
		while((line = br.readLine())!=null)
		{
			count++;
			if(line.contains(word))
			{
				System.out.println(count);
			}
			if(count==0)
			{
				System.out.println("Word not found");
			}
	}
	}
}//end class











