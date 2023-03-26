package com.arrays;

import java.util.Scanner;

public class SumOfArray {
	
	public static void serach(int[] arr, int element)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==element)
			{
				System.out.println(element+" is found");
				break;
			}
		}
	}
	
	public static void change(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=arr[i]+arr[i];
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
	}
	
	public static int sumOfEven(int[] arr)
	{
		int sum =0;
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				sum=sum+arr[i];
			}
		}
		return sum;
	}
	
	public static int sumOfOdd(int[] arr)
	{
		int sum =0;
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				sum=sum+arr[i];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] arr1 = new int[5];
		
		System.out.println("Enter array elements");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i] = (sc.nextInt());
		}
		
		
		//change(arr1);
		
		serach(arr1,2);
//		for(int i=0;i<arr1.length;i++)
//		{
//			System.out.print(arr1[i]+" ");
//		}
//		
//		System.out.println();
		
		
//		int sumEven =sumOfEven(arr1);
//		int sumOdd = sumOfOdd(arr1);
//		System.out.println("Sumof even no:"+sumEven);
//		System.out.println("Sum of odd no:"+sumOdd);
//		
//		Employee[] arr = new Employee[3];
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i] = new Employee(sc.nextInt(),sc.next());
//		}
//		
//
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println(arr[i]);
//		}
//		
		
	}

}
