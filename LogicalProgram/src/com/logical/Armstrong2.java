package com.logical;

public class Armstrong2 {

	public static void main(String[] args) {
		
		int num = 100;
		
		int n=num;
		int cnt;
		
		while(num!=0)
		{
			
			cnt=0;
			int rem = num%10;
			while(num!=0)
			{
				
				cnt++;
				num=num/10;
			}
			int newNum = rem;
		}
	}

}
