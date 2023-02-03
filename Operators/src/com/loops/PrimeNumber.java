package com.loops;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eneter range: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int flag =0;
		
		for(int i=num1;i<=num2;i++)
		{
			flag=0;
			for(int j=2;j<num1;j++)
			{
				if(i%j==0)
				{
					flag++;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(i);
			}
		}

	}

}
