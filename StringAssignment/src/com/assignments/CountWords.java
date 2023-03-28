package com.assignments;

import java.util.Scanner;

public class CountWords {
	
	public static void  countWords(String str)
	{
		String[] words = str.split("\\s");
		
		int count=0;
		for(int i=0;i<words.length;i++)
		{
			
			count++;
			System.out.println(words[i]);
		}
		
		System.out.println("Count of words is:"+count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String str= sc.nextLine();
		countWords(str);
	}

}
