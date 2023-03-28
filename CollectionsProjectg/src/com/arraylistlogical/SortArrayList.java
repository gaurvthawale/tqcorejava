package com.arraylistlogical;

import java.util.ArrayList;

import java.util.List;


public class SortArrayList {
	
	public static void sortList(List<Integer> al)
	{
		for(int i=0;i<al.size();i++)
		{
			for(int j=i+1;j<al.size();j++)
			{
				if(al.get(i)>al.get(j))
				{
					int temp = al.get(i);
					al.set(i, al.get(j));
					al.set(j, temp);
				}
			}
		}
		System.out.println(al);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<>();
		
		
		
		list.add(111);
		list.add(1);
		list.add(33);
		list.add(4);
		list.add(3);
		
		
		
		System.out.println(list);
		sortList(list);
		
		
		
		
	}

}
