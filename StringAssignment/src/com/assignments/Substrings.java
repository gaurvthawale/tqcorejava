package com.assignments;

public class Substrings {
	
	
	public static void possibleSubstrings(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<=str.length();j++)
			{
				System.out.print(str.substring(i, j)+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println();
		String str = "gaurav";
		System.out.println(str);
		possibleSubstrings(str);

	}

}
