package com.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CountIntegers {
	
	public static String convertToWord(int num)
	{
		String word = null;
		
		switch(num)
		{
			case 1 : word="one";
			case 2: word="two";
			case 3 : word = "three";
		}
		
		return word;
	}
	
	public static void countIntegers(ArrayList<Integer> al )
	{
		HashMap<String,Integer> map = new HashMap<>();
		
		for(Integer n : al)
		{
			String str = convertToWord(n);
			
			if(map.containsKey(str))
				map.put(str, map.get(str)+1);
			else
				map.put(str, 1);
		}
		
		Set<Map.Entry<String,Integer>> entries = map.entrySet();
		
		Iterator<Map.Entry<String,Integer>> itr = entries.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry<String,Integer> entry = (Map.Entry<String,Integer>)itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
	}
	

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(1);
		al.add(2);
		al.add(3);
		countIntegers(al);

	}

}
