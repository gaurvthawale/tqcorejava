package com.override;

import java.util.Scanner;

class Bank
{
	public float bal;
	
	public  void saving(float bal, String account)
	{
		if(account=="saving")
		System.out.println("bank class");
	}
	
	public void current(float bal, String account)
	{
		if(account=="current")
		System.out.println("Bank class");
	}
}

class Sbi extends Bank
{
	public void saving(float bal,String account)
	{
		System.out.println("sbi class");
		bal =(bal*0.05f)+bal;
		
		
	}
	
	public void current(float bal, String account)
	{
		System.out.println("sbi class");
		bal =(bal*0.1f)+bal;

	}
}

public class  DynamicMethodDipatch{

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your balance: ");
		int balance = sc.nextInt();		
		Bank b = new Sbi();
		
		
	    
		
	}

}
