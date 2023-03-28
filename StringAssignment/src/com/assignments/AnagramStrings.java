package com.assignments;

import java.util.Scanner;

public class AnagramStrings {

	public static void sortArray(char[] ch)
	{
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]>ch[j])
				{
					char c = ch[i];
					ch[i]=ch[j];
					ch[j]=c;
				}
			}
		}
	}
	
	public static void  anagramString(String str,String ptr)
	{
		char[] ch1 = str.toCharArray();
		char[] ch2 = ptr.toCharArray();
		
		boolean status= true;
		
		sortArray(ch2);
		sortArray(ch1);
		
		if(str.length()!=ptr.length())
			System.out.println("Strings are not anagram.");
		
		else
		{
			for(int i=0;i<ch1.length;i++)
			{
				if(ch1[i]!=ch2[i])
				{
					status = false;
					System.out.println("Strings not anagram");
					break;
				}
			}
			
			if(status==true)
				System.out.println("Strings are anagram..");
		}
			
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String str= sc.next();
		System.out.println("Enter the string");
		String ptr= sc.next();
		
		anagramString(str,ptr);
	}

}
