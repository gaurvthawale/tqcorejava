package com.assignments;

import java.util.Scanner;

public class NextAlphabet {
	
	public static void  nextAlphabet(String str)
	{
		//char ch[] = str.toCharArray();
	
		StringBuilder stb = new StringBuilder();
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			stb = stb.append(++ch);
		}
		
		System.out.println("New String :"+stb);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String str= sc.nextLine();
		nextAlphabet(str);
	}

}
