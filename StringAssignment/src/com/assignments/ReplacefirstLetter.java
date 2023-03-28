package com.assignments;

import java.util.Scanner;

public class ReplacefirstLetter {

	public static void replaceFirstLetterByCapital(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				str = str.replace(str.charAt(i+1), Character.toUpperCase(str.charAt(i+1)));
			}
		}
		
		System.out.println(str);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String str= sc.nextLine();
		replaceFirstLetterByCapital(str);

	}

}
