package com.arraysnew;

import java.util.Arrays;

public class SecondHighestwoSorting {
	
	public static void secondHighest(int ar[])
	{
		int highest=Integer.MIN_VALUE;
		int shighest= Integer.MIN_VALUE;
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>highest)
			{
				shighest=highest;
				highest=ar[i];
			}
			if(ar[i]<highest && ar[i]>shighest)
				shighest=ar[i];
		}
		
		System.out.println("Second highest:"+shighest);
	}

	public static void main(String[] args) {

     int arr[]= {6,7,8,3,4,9,5};
     System.out.println(Arrays.toString(arr));
     /*
     Arrays.sort(arr);

     System.out.println(Arrays.toString(arr));
     */
     secondHighest(arr);
     
	}

}
