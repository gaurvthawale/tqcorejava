package com.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DepartmentTest {
	
	public static void createHashMap(ArrayList<Employee> al)
	{
		HashMap<Department,ArrayList<Employee>> dmap = new HashMap<>();
		
		ArrayList<Employee> empal;
		for(Employee emp: al)
		{
			Department d= emp.getDept();
			if(dmap.containsKey(d))
			{
				empal= dmap.get(d);
				//names.add(emp.getEname());
				//dmap.put(d, names);
			}
			else
			{
				empal= new ArrayList<>();
				
			}
			empal.add(emp);
			dmap.put(d, empal);
		}
		
		for(Map.Entry<Department, ArrayList<Employee>> en:dmap.entrySet())
		{
			System.out.println(en.getKey().getDname()+"  ->"+en.getValue());
		}
		
		
		

	}
	
	public static void main(String[] args)
	{
		Department d1= new Department(1,"HR");
		Department d2= new Department(2,"Sales");
		Department d3= new Department(3,"Technical");

      ArrayList<Employee> list= new ArrayList<>();
      
    
      
      list.add(new Employee(101,"Milind",7000,d2));
      list.add(new Employee(102,"Pratik",7500,d1));
      list.add(new Employee(103,"Sharukh",9000,d3));
      list.add(new Employee(104,"Krutika",5000,d1));
      list.add(new Employee(105,"Shradha",10000,d1));
      list.add(new Employee(106,"Gaurav",6500,d2));
      list.add(new Employee(107,"Rushikesh",12000,d3));
      list.add(new Employee(108,"Kishor",5500,d1));
	}

}
