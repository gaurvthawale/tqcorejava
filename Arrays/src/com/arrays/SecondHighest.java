package com.arrays;

import java.util.Scanner;

public class SecondHighest {
	static Scanner sc = new Scanner(System.in);
	
	public static void alternateElements(int[] arr1,int[] arr2)
	{
		int[] marr = new int[arr1.length];
		for(int i=0;i<arr1.length;i=i+2)
		{
			
			System.out.print(arr1[i]+" ");
			for(int j=i+1;j<arr2.length;)
			{
				System.out.print(arr2[j]+" ");
				break;
			}
		}
	}
	

	public static void enterArray(int[] arr) {
		System.out.println("enter array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = new int[4];
		int[] arr2 = new int[4];

		enterArray(arr1);
		System.out.println("enter elements of array2");
		enterArray(arr2);
		
		alternateElements(arr1,arr2);
		


	}

}
