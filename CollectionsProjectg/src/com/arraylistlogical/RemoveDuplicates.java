package com.arraylistlogical;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
	
	public static void removeDuplicates(List<String> al)
	{
		List<String> al2 = new ArrayList<>();
		
		for(String s : al)
		{
			if(!al2.contains(s))
			{
				al2.add(s);
			}
		}
		System.out.println(al2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		
		
		
		list.add("java");
		list.add("python");
		list.add("mvc");
		list.add("c++");
		list.add("java");
		
		
		
		System.out.println(list);
		removeDuplicates(list);
		
		
		
		
		
	}

}
