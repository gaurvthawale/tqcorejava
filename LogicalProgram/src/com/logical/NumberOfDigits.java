package com.logical;

import java.util.Scanner;

public class NumberOfDigits {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		
		int cnt = 0;
		
		while(num!=0)
		{
			int rem = num%10;
			cnt++;
			num = num/10;
		}
		
		System.out.println("Total Digits : "+cnt);
		
	}

}
