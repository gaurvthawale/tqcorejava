package com.newprac;

public class ToggleCases {
	
	public static void toggleCases(String str)
	{
		String newString=""; 
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			
			if(Character.isUpperCase(ch))
				ch = Character.toLowerCase(ch);
			
			else if(Character.isLowerCase(ch))
				ch = Character.toUpperCase(ch);
			
			newString= newString+ch;
		}
		
		System.out.println(newString);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Big black buck bit a big black dog";
		System.out.println(str);
		toggleCases(str);
		
	}

}
