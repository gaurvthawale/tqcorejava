package com.thursday;

import java.util.Arrays;

public class Duplicates {
	
	public static void frequency(int[] arr)
	{
		int count;
		
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
			System.out.println(arr[i]+" :"+count);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {20,5,7,20,5,8,9};
		
		System.out.println(Arrays.toString(arr));
		frequency(arr);

	}

}
