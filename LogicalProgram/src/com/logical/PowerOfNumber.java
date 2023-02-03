package com.logical;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		
		System.out.println("Enter the power");
		
		int pow = sc.nextInt();
		
		int i = 1;
		while(i<=pow)
		{
			num = num*i;
		}
		System.out.println(num);
		
		

	}

}
