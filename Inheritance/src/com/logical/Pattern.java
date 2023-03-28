package com.logical;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(char ch = 'a';ch<='e';ch++)
		{
			for(char i = 'e';i>=ch;i--)
			{
				System.out.print(" ");
			}
			for(char ch2 = 'a';ch2<=ch;ch2++)
			{
				System.out.print(ch2+" ");
			}
			System.out.println();
		}
	
		for(char ch = 'e';ch>='a';ch--)
		{
			for(char i = 'e';i>=ch-1;i--)
			{
				System.out.print(" ");
			}
			for(char ch2 = 'a';ch2<=ch-1;ch2++)
			{
				System.out.print(ch2+" ");
			}
			System.out.println();
		}
	}

}
