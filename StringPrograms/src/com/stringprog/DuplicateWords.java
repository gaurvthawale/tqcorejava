package com.stringprog;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuplicateWords {
	
	public static  void duplicateWords(String input)
	{
		String[] array = input.split(" ");
		
		HashMap<String,Integer> map = new HashMap<>();
		
		for(int i= 0;i<array.length;i++)
		{
			if(map.containsKey(array[i]))
			{
				map.put(array[i], map.get(array[i])+1);
			}
			else
			{
				map.put(array[i], 1);
			}
		}
		
		Set<String> set = map.keySet();
		Collection<Integer> number = map.values();
		
		
		
		for(String set1:set)
		{
			if(map.get(set1)>1)
			{
				System.out.println(set1+" "+map.get(set1));
			}
		}
		
		
	}
	
	public static boolean isPalindrome(String str)
	{
		char[] array =str.replaceAll("//s+","").toCharArray();
		
		int forward = 0;
		int backward =array.length-1;
		
		while(forward<=backward)
		{
			if(array[forward]!=array[backward])
				return false;
			forward++;
			backward--;
		}
		
		
		return true;
	}

	public static void maxOccuringCharacter(String str)
	{
		char[] array = str.toCharArray();
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(char ch : array)
		{
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
				map.put(ch, 1);
		}
		
		Set<Map.Entry<Character,Integer>> entrySet = map.entrySet();
		int maxCount = 0;
		char maxChar= 0;
		
		for(Map.Entry<Character,Integer> entry : entrySet)
		{
			if(entry.getValue()>maxCount)
			{
				maxCount = entry.getValue();
				maxChar = entry.getKey();
			}
		}
		
		System.out.println(maxChar+" "+maxCount);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string:");
		String input = sc.nextLine();
		
		//duplicateWords(input);
//		if(isPalindrome(input))
//			System.out.println("palindrome string");
//		else
//			System.out.println("Non palibndrome string");
		
		maxOccuringCharacter(input);
//		

	}

}
