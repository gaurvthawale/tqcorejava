package com.arraylistlogical;

import java.util.ArrayList;

public class Frequency {
	
	public static void unique(ArrayList<String> al )
	{
		int count;
		
		for(int i=0;i<al.size();i++)
		{
			count=1;
			if(al.get(i).equals("visited"))
				continue;
			
			for(int j=i+1;j<al.size();j++)
			{
				if(al.get(i).equals(al.get(j)))
				{
					al.set(j, "visited");
					count++;
				}
			}
			
			if(count==1)
			System.out.println(al.get(i));
		}
	}
	
	public static void duplicates(ArrayList<String> al )
	{
		int count;
		
		for(int i=0;i<al.size();i++)
		{
			count=1;
			if(al.get(i).equals("visited"))
				continue;
			
			for(int j=i+1;j<al.size();j++)
			{
				if(al.get(i).equals(al.get(j)))
				{
					al.set(j, "visited");
					count++;
				}
			}
			
			if(count>1)
			System.out.println(al.get(i));
		}
	}
	
	public static void countOfElements(ArrayList<String> al )
	{
		int count;
		
		for(int i=0;i<al.size();i++)
		{
			count=1;
			if(al.get(i).equals("visited"))
				continue;
			
			for(int j=i+1;j<al.size();j++)
			{
				if(al.get(i).equals(al.get(j)))
				{
					al.set(j, "visited");
					count++;
				}
			}
			
			if(count>1)
			System.out.println(al.get(i)+" :"+count);
		}
	}

	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<>();
		
		al.add("A");
		al.add("b");
		al.add("C");
		al.add("A");
		al.add("B");
		al.add("C");
		System.out.println(al);
		duplicates(al);
		countOfElements(al);
		unique(al);
		

	}
	
}
