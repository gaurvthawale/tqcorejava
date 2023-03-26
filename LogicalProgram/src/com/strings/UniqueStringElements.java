package com.strings;

public class UniqueStringElements {
	
	private static void uniqueOfSecond(String[] str1, String[] str2) {
	
		boolean status;
		
		for(int i=0;i<str2.length;i++)
		{
			status=true;
			if(str2[i].equals("visited"))
				continue;
			
			for(int j=0;j<str1.length;j++)
			{
				if(str2[i].equals(str1[j]))
				{
					status=false;
					str1[j]="visited";
				}
			}
			if(status)
				System.out.println(str2[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		
		String[] str1={"mamta@gmail.com", "pratik@gmail.com","vivek@gmail.com"};
		String[] str2={"pratik@gmail.com","vivek@gmail.com","priya@gmail.com","bhushan@gmail.com"};
		
		uniqueOfSecond(str1,str2);


	}

	

}
