package day4;

import java.util.HashMap;
import java.util.Map;

public class MainExecution {
		

		public static void main(String[] args) {
			
			Employeeservice service = new Employeeservice();
			String codes[] = service.getEmployeeCodes();
			
			service.employeeDept();
			
			Map<String,String> empMap = new HashMap<>();
			
			empMap.put("011","Delhi");
			empMap.put("022","Mumbai");
			empMap.put("080","Bangalore");
			empMap.put("020","Pune");
			
			for (String empid : codes) {
				/*if((empid.substring(6,9)).contentEquals("011"))
						System.out.println(empid+"->Delhi");
				else if((empid.substring(6,9)).contentEquals("022"))
					System.out.println(empid+"->Mumbai");
				else if((empid.substring(6,9)).contentEquals("080"))
					System.out.println(empid+"->Bangalore");
				else if((empid.substring(6,9)).contentEquals("020"))
					System.out.println(empid+"->Pune");
				else
					System.out.println("not found");*/
				System.out.println(empid.substring(0,3)+":"+empid.substring(6,9)+":"+empMap.get(empid.substring(6,9)));
				
			}
			
		
		
		}//end main

	}
	

