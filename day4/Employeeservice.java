package day4;

import java.util.HashMap;
import java.util.Map;

public class Employeeservice {
	private String employees[] = {"101001011","102001022","103002011","104003080","105002020","106002080"};
	/*
	 * Note : employee codes are designed in following way: 
	 * a) first 3 digits are employee code
	 * b) next 3 digits are related to their department id.
	 * c) and last 3 digits are the city code of their work location 
	 *     for example 
	 *       011 : Delhi 
	 *       022 : Mumbai 
	 *       080 : Banglore
	 *       020 : Pune
	 * */
	
	public String[] getEmployeeCodes()
	{
		String codes[] = new String[employees.length];
		int count = -1;
		for (String empid : employees) {
			codes[++count] = empid.substring(0, 3)+" : "+empid.substring(6,9);
		}
		return codes;
	}
	
	public void employeeDept()
	{
		Map<String,Integer> empdeptMap = new HashMap<>();
		
		for(String deptid : employees)
		{
			if(empdeptMap.containsKey(deptid.substring(3,6)))
					{
						empdeptMap.put(deptid.substring(3,6),empdeptMap.get(deptid.substring(3,6))+1);
					}
			else
			{
				empdeptMap.put(deptid.substring(3,6),1);//if it exists only one time it will return one.
			}
		}
		for (Map.Entry entry : empdeptMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
	}
}//


