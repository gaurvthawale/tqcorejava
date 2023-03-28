package com.assignments;

import java.util.Scanner;

public class PalindromeString {
	
	public static void palindrome(String str)
	{
		str= str.toLowerCase();
		char[] ch = str.toCharArray();
		
		char[] ch1 = new char[str.length()];
		
		
		String st;
		int j=0;
		for(int i=str.length()-1;i>=0;i--)
		{
			ch1[j]=ch[i];
			j++;
		}
		System.out.println(ch1);
		
		
		if(ch.equals(ch1))
			System.out.println("palindrome string");
		else
			System.out.println("non palindrome strings");
	}
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String str= sc.next();
		palindrome(str);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
