package com.bank;

public class Account {
	
	private int id;
	private float balance;
	private String bankName;
	private String name;
	
	Account()
	{
		
	}
	
	Account(int id, float balance, String bankName, String name)
	{
		this.balance=balance;
		this.bankName= bankName;
		this.id= id;
		this.name = name;
		
	}
	
	public void setId(int id)
	{
		this.id =id;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name =name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setBankName(String bankName)
	{
		this.bankName= bankName;
	}
	
	public String getBankName()
	{
		return bankName;
	}
	
	public String toString()
	{
		return "Account: "+name+" "+bankName+" "+balance;
	}
}
