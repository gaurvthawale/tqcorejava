package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AlternateElements2 {
	static Scanner sc = new Scanner(System.in);
	
	public static int[] alternateElements(int ar1[], int ar2[])
	{
		int size1= ar1.length;
		int size2= ar2.length;
		int size=0;		
		int marr[];
		if(size1>size2)
		{
			marr= new int[size1];
			size=size2;			
		}
		else
		{
			marr= new int[size2];
			size=size1;
		}
		
		int i,j,k;
		i=0;
		j=0;
		for(k=0;k<size;k++)
		{
			if(k%2==0)
				marr[k]=ar1[i];
			else
				marr[k]=ar2[j];
			
			i++;
			j++;
		
		}
		
		while(i<size1)
		{
			marr[k++]=ar1[i++];
		}
		
		while(j<size2)
		{
			marr[k++]=ar2[j++];
		}
		

		System.out.println(Arrays.toString(marr));
		
		
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

		int[] arr1 = new int[6];
		int[] arr2 = new int[4];

		enterArray(arr1);
		System.out.println("enter elements of array2");
		enterArray(arr2);
		
		alternateElements(arr1,arr2);
		


	}

}
