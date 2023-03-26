package com.arrays;

import java.util.Scanner;

public class AlternateElements {
	static Scanner sc = new Scanner(System.in);
	
	public static int[] mergeArray(int ar1[], int ar2[])
	{
		int size1= ar1.length;
		int size2= ar2.length;
		
		int marr[]= new int[size1+size2];
		int i,j;
		int k=0;
		for( i=0,j=0;i<size1&&j<size2;i++,j++)
		{
			marr[k++]=ar1[i];
			marr[k++]=ar2[j];
		}
		
		//System.out.println(Arrays.toString(marr));
		//remaining elements
		while(i<size1)
		{
			marr[k++]=ar1[i++];
		}
		
		while(j<size2)
		{
			marr[k++]=ar2[j++];
		}
		
		//System.out.println(Arrays.toString(marr));
		return marr;
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
		
		mergeArray(arr1,arr2);
		


	}

}
