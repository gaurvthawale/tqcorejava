package com.phone;

public class Phone {
	
	protected int id;
	protected long phoneno;
	protected float bill;
	
	Phone()
	{
		
	}
	
	Phone(int id, long phoneno,float bill)
	{
		this.id = id;
		this.bill= bill;
		this.phoneno = phoneno;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public long getPhoneno()
	{
		return phoneno;
	}

	public void setPhoneno(long phoneno)
	{
		this.phoneno = phoneno;
	}

	public float getBill() 
	{
		return bill;
	}

	public void setBill(float bill)
	{
		this.bill = bill;
	}
	
	

}
