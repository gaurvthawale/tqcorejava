package com.arraylistlogical;

import java.util.ArrayList;

import java.util.List;


public class ReverseArrayList {
	
	public static void reverseList(List<String> al)
	{
		//Iterator<String> itr = al.iterator();
		
		//ListIterator<String> litr = al.listIterator();
		
		for(int i=0,j=al.size()-1;i<al.size()/2;i++,j--)
		{
			String str = al.get(i);
			al.set(i, al.get(j));
			al.set(j, str);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		
		List<String> list2 = new ArrayList<>();
		
		list.add("java");
		list.add("python");
		list.add("mvc");
		list.add("c++");
		list.add("java");
		
		
		
		System.out.println(list);
		reverseList(list);
		System.out.println(list);
		
		
		
		
		
	}

}
