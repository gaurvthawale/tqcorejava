package com.arraylist;

import java.util.ArrayList;

public class IcecreamTest {

	public static void main(String[] args) {
		
		ArrayList<Icecream> al = new ArrayList<>();
		
		al.add(new Icecream());
		al.add(new Icecream("small"));
		
		for(Icecream c : al)
		{
			System.out.println(c);
		}
		

	}

}
