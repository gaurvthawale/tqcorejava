package com.array.practice;

import java.util.Scanner;

public class ArraySolving {

	static Scanner sc = new Scanner(System.in);
	
	public static void commonElements(int[] arr1,int[] arr2)
	{
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.println(arr1[i]+" ");
				}
			}
		}
	}
	
	
	public static void enterArray(int[] arr) {
		System.out.println("enter array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}
	
	public static void printArray(int[] arr)
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");

		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = {6,7,8,9,4,3,1};
		int[] arr2 = {8,5,3,11,2,4,7};

		commonElements(arr1,arr2);
		
	}

}
