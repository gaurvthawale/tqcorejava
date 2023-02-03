package com.logical;

import java.util.Scanner;

public class PrimeNumber {

	
	public static void checkPrime(int num)
	{
		
		boolean flag =true;
		
		if((num==0)||(num==1))
		{
			System.out.println(num+" is not prime.");
		}
		else
		{
			for(int i = 2;i<num/2;i++)
			{
				if(num%i==0)
				{
					System.out.println(num+" is not prime");
					flag = false;
					break;
				}
			}
			if(flag)
			{
				System.out.println(num+" is prime number.");
			}
		}
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		checkPrime(num);
		
		
	}

}
