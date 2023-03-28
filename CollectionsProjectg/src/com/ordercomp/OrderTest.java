package com.ordercomp;

import java.util.ArrayList;
import java.util.Collections;

public class OrderTest {

	public static void main(String[] args) {
		
		
		ArrayList<Order> od = new ArrayList<>();
		
		od.add(new Order(1,"samosa",20f));
		od.add(new Order(10,"juice",25f));
		od.add(new Order(2,"samosa",25f));
		od.add(new Order(6,"coffee",250f));
		od.add(new Order(8,"tea",200f));
		
		for(Order o : od)
		{
			System.out.println(o);
		}
		
		Collections.sort(od);
		
		System.out.println("--------------- Sorting ----------------");
		for(Order o : od)
		{
			System.out.println(o);
		}
		
		
		
		

	}

}
