package com.stringprog;

import java.util.Scanner;

public class ReverseStringByCharacter {
	
	
	public static void reverseStringWordByWord(String str)
	{
		String[] arr = str.split("\\s");
		
		for(int i=arr.length-1;i>=0;i--)
		{
			for(int j=arr[i].length()-1;j>=0;j--)
			{
				System.out.print(arr[i].charAt(j));
			}
			System.out.print(" ");
		}
		
	}
	
	public static void reverseStringByCharacter(String str)
	{
		String[] arr = str.split("\\s");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=arr[i].length()-1;j>=0;j--)
			{
				System.out.print(arr[i].charAt(j));
			}
			System.out.print(" ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc= new Scanner(System.in);
	System.out.println("Enter the string");
		String str = sc.nextLine();
		reverseStringByCharacter(str);
		//reverseStringWordByWord(str);
	}

}
