package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class GenericArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List list = new ArrayList();
		
		list.add(12);
		list.add("gayrav");
		list.add(12.12f);
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
			int num = (int)list.get(i)+10;
			list.set(i, num);
			
		}
		
		for(Object o : list)
		{
			System.out.println(o);
		}

	}

}
