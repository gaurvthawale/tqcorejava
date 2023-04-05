package com.hashmapcustom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EmployeeHashMap2 {

	public static void deptemp(ArrayList<Employee> emps)
	{
		HashMap<Department,ArrayList<String>> map = new HashMap<>();
		
		ArrayList<String> names;
		
		for(Employee e : emps)
		{
			if(map.containsKey(e.getDept()))
			{
				names= map.get(e.getDept());
			}
			else
				names= new ArrayList<String>();
			names.add(e.getName());
			map.put(e.getDept(),names );
				
		}
		
		for(Map.Entry<Department,ArrayList<String>> m : map.entrySet())
		{
			System.out.println(m.getKey().getDname()+ " :"+m.getValue());
		}
	}
	
	public static void main(String[] args) {
		
		Department d1 = new Department(1,"HR");
		Department d2 = new Department(2,"Developement");

		Department d3 = new Department(3,"Marketing");

		
		ArrayList<Employee> al = new ArrayList<>();
		
		al.add(new Employee(1,"gaurav",4000,d1));
		al.add(new Employee(2,"rushikesh",6000,d2));

		al.add(new Employee(3,"mohit",8000,d3));

		al.add(new Employee(4,"vaibhav",15000,d1));

		al.add(new Employee(5,"milind",20000,d1));

		al.add(new Employee(6,"pratik",43800,d1));
		al.add(new Employee(7,"omkar",40009,d2));
		al.add(new Employee(8,"prasanna",40600,d3));

		deptemp(al);
	}

}
