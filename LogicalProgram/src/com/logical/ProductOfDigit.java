package com.logical;

import java.util.Scanner;

public class ProductOfDigit {
	
	public static void prodOfDigit(int num)
	{
		int prod = 1;
		while(num!=0)
		{
			int rem = num%10;
			prod*= rem;
			num = num/10;
			
		}
		System.out.println("product of digits: "+prod);
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enetr the number: ");
		int num = sc.nextInt();
		prodOfDigit(num);
		sc.close();
		

	}

}
