package com.TreeMap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap<Customer,Order> map1 = new TreeMap<>();
	
		Order o1 = new Order(1,200f);
		Order o2 = new Order(2,400f);
		Order o3 = new Order(3,600f);

		map1.put(new Customer(1,"gaurav",9876544),o1);
		map1.put(new Customer(2,"vaibhav", 987654),o3);
		map1.put(new Customer(3, "mohit",3456767),o2);
		
		
		
		
		NavigableMap<Customer,Order> namp = map1.descendingMap();
		
		for(Map.Entry<Customer,Order> e : namp.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getKey());
		}

		
		
		
	}

}
