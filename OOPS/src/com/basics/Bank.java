package com.basics;

public class Bank {
	
	int pId;
	String pName;
	int accNo;
	String accountType;
	float accountBal;
	
	void enterDetails(int id, String name, int account,float accountbal,String accounttype)
	{
		pId = id;
		pName = name;
		accNo = account;
	}
	
	void displayDetails()
	{
		System.out.println(pId+" "+pName+" "+accNo+" "+accountBal);
	}
	
	public void cashDeposit(String name, int amount)
	{
		if(pName==name)
		{
			accountBal+=amount;
		}
	}
	
	public static void main(String[] args)
	{
		Bank b1 = new Bank();
		
		b1.enterDetails(23,"gaurav", 23456,2345f,"saving");
		
		b1.displayDetails();
	}
	
	

}
