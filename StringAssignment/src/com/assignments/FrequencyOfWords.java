package com.assignments;

import java.util.Scanner;

public class FrequencyOfWords {
	
	public static void  frequencyOfWords(String str)
	{
		String[] words = str.split("\\s");
		
		int count;
		for(int i=0;i<words.length;i++)
		{
			count=1;
			if(words[i].equals("visited"))
				continue;
			
			for(int j=i+1;j<words.length;j++)
			{
				if(words[i].equals(words[j]))
				{
					count++;
					words[j]="visited";
				}
			}
			
			System.out.println(words[i]+" :"+count);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String str= sc.nextLine();
		frequencyOfWords(str);
	}

}
