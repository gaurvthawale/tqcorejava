package com.assignments;

import java.util.Scanner;

public class ReplaceVowels {
	
	public static void replaceVowels(String str)
	{
		
		str = str.toLowerCase();
		char ch[] = str.toCharArray();
		int count;
		for(int i=0;i<ch.length;i++)
		{
			
			if((ch[i]=='a')||(ch[i]=='e')||(ch[i]=='i')||(ch[i]=='o')||(ch[i]=='u'))
			{
				ch[i]='$';
			}
			
		}
		System.out.println(ch);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String str= sc.next();
		replaceVowels(str);
	}

}
