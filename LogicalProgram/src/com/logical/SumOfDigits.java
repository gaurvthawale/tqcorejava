package com.logical;

import java.util.Scanner;

public class SumOfDigits {
	
	public static void extractDigit(int num)
	{
		int sum = 0;
		while(num!=0)
		{
			int rem = num%10;
			sum = sum+ rem;
			num = num/10;
			
		}
		System.out.println("Sum o f digits: "+sum);
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enetr the number: ");
		int num = sc.nextInt();
		extractDigit(num);
		

	}

}
