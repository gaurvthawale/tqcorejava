package com.cardriver;

import java.util.Arrays;

public class Car {

	private int cid;
	private String model;
	private Driver[] drivers;
	
	Car()
	{
		
	}
	
	Car(int cid,String model, Driver[] drivers)
	{
		this.cid=cid;
		this.model=model;
		this.drivers= drivers;
	}
	
	public void setCid(int cid)
	{
		this.cid=cid;
	}
	
	public int getCid()
	{
		return cid;
	}
	
	public void setDrivers(Driver[] drivers)
	{
		this.drivers=drivers;
	}
	
	public Driver[] getDrivers()
	{
		return drivers;
	}
	
	
	
	public String getModel() 
	{
		return model;
	}

	public void setModel(String model)
	{
		this.model = model;
	}

	public String toString()
	{
		return "Car:"+cid+" "+model+" "+Arrays.toString(drivers);
	}
	
	
	
}
