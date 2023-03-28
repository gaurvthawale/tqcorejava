package com.assignments;

import java.util.Scanner;

public class Duplicates {
	
	public static void  duplicates(String str)
	{
		char ch[] = str.toCharArray();
		int count;
		for(int i=0;i<ch.length;i++)
		{
			count=1;
			if(ch[i]=='\0')
				continue;
			
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					ch[j]='\0';
				}
			}
			
			if(count>1)
			
			System.out.println(ch[i]+" :"+count);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String str= sc.next();
		duplicates(str);
	}

}
