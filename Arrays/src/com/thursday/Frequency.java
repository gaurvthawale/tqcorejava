package com.thursday;

import java.util.Arrays;

public class Frequency {
	
	public static void frequency(int[] arr)
	{
		int count;
		int dcount=0;
		
		for(int i=0;i<arr.length;i++)
		{
			count=1;
			if(arr[i]=='\0')
				continue;
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					arr[j]='\0';
				}
			}
			if(count>1)
			{
				dcount++;
				System.out.println(arr[i]+" :"+count);
			}
			
		}
		System.out.println("Number of duplicates: "+dcount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {20,5,7,20,5,8,9};
		
		System.out.println(Arrays.toString(arr));
		frequency(arr);

	}

}
