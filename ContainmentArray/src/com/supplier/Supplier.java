package com.supplier;

import java.util.Arrays;

public class Supplier {
	
	private int id;
	private String sname;
	private String phoneNo;
	private Item[] items;
	
	
	Supplier()
	{
		
	}
	
	Supplier(int id,String sname, String phoneNo,Item[] item)
	{
		this.id=id;
		this.sname=sname;
		this.phoneNo=phoneNo;
		this.items=item;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getSname()
	{
		return sname;
	}

	public void setSname(String sname) 
	{
		this.sname = sname;
	}

	public String getPhoneNo() 
	{
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) 
	{
		this.phoneNo = phoneNo;
	}

	public Item[] getItem() 
	{
		return items;
	}

	public void setItem(Item[] item) 
	{
		this.items = item;
	}

	public String toString()
	{
		return "Supplier:"+id+" "+sname+" "+phoneNo+" "+Arrays.toString(items);
	}
	
}
