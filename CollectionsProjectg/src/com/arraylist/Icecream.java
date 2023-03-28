package com.arraylist;

import java.util.ArrayList;

public class Icecream {
	
	private int price;
	private String scoopsize;
	private ArrayList<String> flavours;
	
	Icecream()
	{
		this.price=80;
		this.scoopsize="big";
		this.flavours=new ArrayList<>();
		this.flavours.add("vanila");
		this.flavours.add("mango");
		this.flavours.add("butterscotch");
	}

	Icecream(String scoopsize)
	{
		this.price=80;
		this.scoopsize="small";
		this.flavours=new ArrayList<>();
		this.flavours.add("vanila");
		this.flavours.add("mango");
		this.flavours.add("butterscotch");
	}

	@Override
	public String toString() {
		return "Icecream [price=" + price + ", scoopsize=" + scoopsize + ", flavours=" + flavours + "]";
	}
	
	

}
