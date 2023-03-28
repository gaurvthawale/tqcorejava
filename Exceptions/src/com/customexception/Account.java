package com.customexception;

public class Account {
	
	int id;
	String name;
	float balance;
	
	Account()
	{
		
	}
	
	Account(int id,String name, float balance)
	{
		this.id=id;
		this.name=name;
		this.balance= balance;
	}
	
	public void deposit(float amount)
	{
		this.balance+=amount;
	}
	
	public void withdraw(float amount) 
	{
		try
		{
			if(this.balance<amount)
			{
				throw new InsufficientBalanceException();
			}
		}
		
		catch(InsufficientBalanceException e )
		{
			System.out.println("Account balance is demanising...");
		}
	}

}
