package com.logical;

public class krishnamurti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 145;
		int originalnum = num;
		int newnum=0;
		int fact = 1;
		int a = Integer.parseInt(null);
		
		while(num!=0)
		{
			int rem = num%10;
			while(rem!=0)
			{
				fact= fact * rem;
				rem--;
			}
			num=num/10;
			newnum = newnum+fact;
			fact=1;
		}
		
		if(originalnum==newnum)
			System.out.println(originalnum+" is Krisnamurti number");
		else
			System.out.println(originalnum+" is not krishnamurti number.");

	}

}
