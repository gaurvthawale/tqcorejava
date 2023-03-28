package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class NonGenericArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		
		List<String> list2 = new ArrayList<>();
		
		list.add("java");
		list.add("python");
		list.add("java");
		list.add("java");
		
		
		list2.add("vb.net");
		list2.add("C#");
		list2.add("asp.net mvc");
	
		
		list.addAll(list2);
		System.out.println(list);
		
		list.retainAll(list2);
		System.out.println(list);

		
		list.removeAll(list2);
		
		
		
		System.out.println(list);
		
		
		
		
	}

}
