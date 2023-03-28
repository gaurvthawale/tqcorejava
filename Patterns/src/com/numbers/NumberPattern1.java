package com.numbers;

import java.util.Scanner;

public class NumberPattern1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rows");
		int n = sc.nextInt();
		for(int i = 1;i<=n;i++)
		{
			for(int j=n-i;j>0;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++)
			{
				System.out.println(i+" ");
			}
			
			System.out.println();
		}

	}

}
