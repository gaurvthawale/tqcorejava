package com.logical;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		int cnt =0;
		
		for(int i=2;i<=num/2;i++)
		{
			if(num%2==0)
			{
				System.out.println(num+" is not prime");
				cnt++;
				break;
			}
		}
		
		if(cnt==0)
			System.out.println(num+" is not prime.");

	}

}
