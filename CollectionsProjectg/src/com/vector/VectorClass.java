package com.vector;

import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		
		Vector<String> cols = new Vector<>();
		
		cols.ensureCapacity(20);
		System.out.println(cols.capacity());
		System.out.println(cols.size());
		
		cols.add("Red");
		cols.addElement("Blue");
		cols.add("Greeen");
		
		cols.add("Red");
		cols.addElement("Blue");
		cols.add("Greeen");
		
		cols.add("Red");
		cols.addElement("Blue");
		cols.add("Greeen");
		
		System.out.println(cols);
		System.out.println(cols.capacity());
		System.out.println(cols.size());
		
		cols.add("Red");
		System.out.println(cols.capacity());
		cols.addElement("Blue");
		cols.add("Greeen");
		
		System.out.println(cols);

		System.out.println(cols.capacity());
		System.out.println(cols.size());
		
		cols.addElement("Blue");
		cols.add("Greeen");
		
		System.out.println(cols.capacity());
		System.out.println(cols.size());
		

	}

}
