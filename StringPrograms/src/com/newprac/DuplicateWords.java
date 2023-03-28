package com.newprac;

public class DuplicateWords {

	
	public static void duplicateWords(String str)
	{
		str= str.toLowerCase();
		String[] arr = str.split("\\s");
		
		int cnt ;
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i].equals("visited"))
				continue;
			cnt=1;
			
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].equals(arr[j]))
				{
					cnt++;
					arr[j]="visited";
				}
			}
			if(cnt>1)
			{
				System.out.println(arr[i]+" :"+cnt);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Big black buck bit a big black dog";
		System.out.println(str);
		duplicateWords(str);
		
	}

}
