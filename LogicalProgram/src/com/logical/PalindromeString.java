package com.logical;

import java.util.Scanner;

public class PalindromeString {
	
	
	static Scanner sc = new Scanner(System.in);
	
	public static boolean isItPalindrome(String input)
	{
		if(input.length()<2)
		{
			return true;
		}
		else
		{
			if(input.charAt(0)!= input.charAt(input.length()-1))
				return false;
			
			else 
				return isItPalindrome(input.substring(1,input.length()-1));
		}
		
		
	}

	public static void main(String[] args) {
		
		System.out.println("ENter tge string");
		String input = sc.nextLine();
		
		String inputString = input.replaceAll("//s+","");
		boolean desh = isItPalindrome(inputString);
		System.out.println(desh);

	}

}
