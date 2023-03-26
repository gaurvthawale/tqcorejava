package com.arraysnew;

import java.util.Arrays;

public class HalfSorting {
	
	public static void halfsort(int ar[])
	{
		int len = ar.length;
		int temp;
		for(int i=0;i<len/2;i++)
		{
			for(int j=i+1;j<len/2;j++)
			{
				if(ar[i]>ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
					
			}
		}
		
		//System.out.println(Arrays.toString(ar));
		// for descending other half
		
		for(int i=len/2;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(ar[i]<ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
					
			}
		}
		
		//System.out.println(Arrays.toString(ar));
	}
	
	
	public static void printArray(int ar[])
	{
		for(int x:ar)
		{
			System.out.print(x+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

     int arr[]= {4,7,3,2,9,0,7,6};
     
     System.out.println("Before:");
     printArray(arr);
     
     System.out.println("=====================");
     halfsort(arr);
     
     System.out.println("After sorting");
     printArray(arr);
     

	}

}
