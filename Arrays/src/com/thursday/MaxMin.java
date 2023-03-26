package com.thursday;

import java.util.Scanner;

public class MaxMin {
	
	public static void primeNumber(int[] arr)
	{
		int cnt = 0;
		for(int j=0;j<arr.length;j++)
		{
			cnt=0;
			if((arr[j]==0) || (arr[j]==1))	
			{
				break;
			}
			
			for(int i=2;i<=(arr[j]/2);i++)
			{
					if(arr[j]%i==0)
					{
						cnt++;
						break;
					}
					
				
			}
			if(cnt==0)
			System.out.println(arr[j]+"");
		}
	
	}
	
	public static void printArray(int[] arr)
	{
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static void addNext(int[] arr)
	{
		
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=arr[i]+arr[i+1];
		}
	}
	
	public static void alternatePrint(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				continue;
			}
			System.out.print(i+" ");
		}
	}
	
	public static void alternatePrintTwo(int[] arr)
	{
		for(int i=0;i<arr.length-2;i++)
		{
			if(i%2==0)
			{
				continue;
			}
			System.out.println(i+" ");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		int[] arr = new int[5];
		System.out.println("enter array elements");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		//addNext(arr);
		//alternatePrintTwo(arr);
		//printArray(arr);
		primeNumber(arr);

	}

}
