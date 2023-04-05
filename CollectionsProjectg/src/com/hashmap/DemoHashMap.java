package com.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DemoHashMap {

	public static void main(String[] args) {
		
		HashMap<String,Integer> map = new HashMap<>();
		
		map.put("Maharashtra",11);
		map.put("Kerala", 22);
		map.put("karanatka", 44);
		map.put("Punjab", 56);
		
		
		Set<String> keys=map.keySet();
		
		for(String s : keys)
		{
			System.out.println(s+" "+map.get(s));
			
		}
		
		
		
		
		
		Set<Map.Entry<String,Integer>> entries = map.entrySet();
		
		Iterator<Map.Entry<String,Integer>> itr = entries.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry<String,Integer> entry = (Map.Entry<String,Integer>)itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		

	}

}
