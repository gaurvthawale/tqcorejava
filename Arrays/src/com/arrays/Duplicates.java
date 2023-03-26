package com.arrays;

import java.util.*;

public class Duplicates {
	
	
	private static void duplicates(int[] array)
	{
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(Integer num : array)
		{
			if(map.containsKey(num))
			{
				map.put(num, map.get(num)+1);
			}
			
			else
				map.put(num,1);
		}
		
		Set<Integer> numbers = map.keySet();
		
		for(Integer num : numbers)
		{
			if(map.get(num)>1)
			{
				System.out.println(num+ " "+map.get(num));
			}
		}
		
		
		
	}
	
	public static void duplicateUsingSet(int[] array)
	{
		HashSet<Integer> numbers = new HashSet<>();
		
		for(Integer num : array)
		{
			if(!numbers.add(num))
			{
				System.out.println(num);
			}
		}
	}

	public static void main(String[] args) {
	
		
		int[] array = {23,56,78,23,46,90,90,46,56};
		
		//duplicates(array);
		Duplicates.duplicateUsingSet(array);

	}

	

}
