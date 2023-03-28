package com.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IterateArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		
		list.add("java");
		list.add("python");
		list.add("c#");
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
			
			
		}
		
		System.out.println("====================================================");
		
		for(Object o : list)
		{
			System.out.println(o);
		}
		
		System.out.println("====================================================");

		
		ListIterator<String> li2 = list.listIterator();
		
		while(li2.hasNext())
		{
			System.out.println(li2.next());
		}
		
		System.out.println("====================================================");

		
		ListIterator<String> li1 = list.listIterator(list.size());
		
		while(li1.hasPrevious())
		{
			System.out.println(li1.previous());
		}
			
	}

}
