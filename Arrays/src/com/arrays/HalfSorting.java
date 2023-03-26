package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class HalfSorting {

	static Scanner sc = new Scanner(System.in);

	private static void halfSorting(int[] arr) {

		int i = arr.length-1;
		int mid = i/2;
		
		for(int j =0;j<arr.length;j++)
		{
			for(int k=0;k<arr.length;k++)
			{
				if(k<=mid && j<=mid)
				{
					if(arr[j]>arr[k])
					{
						int temp = arr[j];
						arr[j]=arr[k];
						arr[k]=temp;
					}
				}
				if(k>mid && j>mid)
				{
					if(arr[j]<arr[k])
					{
						int temp = arr[j];
						arr[j]=arr[k];
						arr[k]=temp;
					}
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[6];

		enterArray(arr);

		halfSorting(arr);
		
		System.out.println(Arrays.toString(arr));

	}

}
