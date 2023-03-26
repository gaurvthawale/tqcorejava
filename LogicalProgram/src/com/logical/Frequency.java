package com.logical;

import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		


		int num = 4312122;
		int n;
		int count;
		for(int i=0;i<10;i++)
		{
			n=num;
			count = 0;
			
			while(n!=0)
			{
				if(i==(n%10))
					count++;
				n = n/10;
			}
			if(count>0)
				System.out.println(i+" : "+count);
			
		}
	}

}
