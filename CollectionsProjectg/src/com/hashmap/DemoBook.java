package com.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DemoBook {

	public static void main(String[] args) {
		
		HashMap<Book,String> map = new HashMap<>();
		
		map.put(new Book(1,"wings of fire",400),"apj kalam");
		map.put(new Book(2,"bhagavadgita",600),"krishna");
		map.put(new Book(3,"ramachritmanas",300),"ramayan");
		map.put(new Book(4,"azad hind fauz",500),"subhash chandra bose");
		map.put(new Book(3,"ramachritmanas",300),"ramanujan");
		
		
		
		Set<Book> keys = map.keySet();
		
		for(Book b : keys)
		{
			System.out.println(b);
		}
		
		System.out.println("================================================================");
		
		
		
		Set<Map.Entry<Book,String>> entries = map.entrySet();
		
		Iterator<Map.Entry<Book,String>> itr = entries.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry<Book,String> entry = (Map.Entry<Book,String>)itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		

	}

}
