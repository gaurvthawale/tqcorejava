package com.supplier;

public class Item {
	
	private int id;
	private String name;
	private float unitPrice;
	
	
	Item()
	{
		
	}
	
	Item(int id, String name,float unitPrice)
	{
		this.id=id;
		this.name=name;
		this.unitPrice=unitPrice;
		
	}

	public void setId(int id) 
	{
		this.id = id;
	}
	
	public int getId()
	{
		return id;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	

	public String getName() 
	{
		return name;
	}

	

	public void setUnitPrice(float unitPrice)
	{
		this.unitPrice = unitPrice;
	}

	public float getUnitPrice()
	{
		return unitPrice;
		
	}

	
	
	
	public String toString()
	{
		return "Item: :"+id+" "+name+" "+unitPrice;
	}
	

}
