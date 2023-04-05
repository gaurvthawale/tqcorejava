package com.hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class PrintCount {
	
	public static void createMap(ArrayList<String> al)
	{
		HashMap<String,Integer> map = new HashMap<>();
		
		for(String s : al)
		{
			if(map.containsKey(s))
				map.put(s, map.get(s)+1);
			else
				map.put(s, 1);
		}
		
		}

	public static void main(String[] args) {
	
		ArrayList<String> al = new ArrayList<>();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("A");
		al.add("B");
		al.add("C");
		
		createMap(al);
		
	}

}
