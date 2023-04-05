package com.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DemoEmplpoyee {

	public static void main(String[] args) {
		
		HashMap<Employee,String> map = new HashMap<>();
		
		map.put(new Employee(1,"gaurav",400),"apj kalam");
		map.put(new Employee(2,"mohit",600),"krishna");
		map.put(new Employee(3,"mohit",300),"ramayan");
		map.put(new Employee(4,"milind",500),"subhash chandra bose");
		map.put(new Employee(3,"milind",300),"ramanujan");
		
		
		
		Set<Employee> keys = map.keySet();
		
		for(Employee b : keys)
		{
			System.out.println(b);
		}
		
		System.out.println("================================================================");
		
		
		
		Set<Map.Entry<Employee,String>> entries = map.entrySet();
		
		Iterator<Map.Entry<Employee,String>> itr = entries.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry<Employee,String> entry = (Map.Entry<Employee,String>)itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		

	}

}
