package com.abstractnew;

abstract public class Loan {
	
	private String name;
	private float amount;
	private int validity;
	private int loanId;
	
	Loan()
	{
		System.out.println("Abstarct class default ctor");
	}
	
	Loan(String name,float amount,int validity, int loanId)
	{
		this.name = name;
		this.loanId = loanId;
		this.amount=amount;
		this.validity =validity;
	}
	
	abstract void interestRate(float principal,int years);
	
	
	public String toString()
	{
		return "LoanInfo: "+name;
	}
	
	
	
	
	
	
	

}
