package com.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class IteratingVector {

	public static void main(String[] args) {
		
		Vector<String> cols = new Vector<>();
		
		
		cols.add("Red");
		cols.addElement("Blue");
		cols.add("Greeen");
		
		cols.add("Red");
		cols.addElement("Blue");
		cols.add("Greeen");
		
		cols.add("Red");
		cols.addElement("Blue");
		cols.add("Greeen");
		
		
		cols.add("Red");

		cols.addElement("Blue");
		cols.add("Greeen");
	
		
		cols.addElement("Blue");
		cols.add("Greeen");
	
		System.out.println("-------------------Using mnormal for loop------------------------");
		for(int i=0;i<cols.size();i++)
		{
			System.out.print(cols.elementAt(i)+" ");
		}
		
		System.out.println();
		
		System.out.println("--------------- Enhanced for loop------------------------------");
		for(String s : cols)
		{
			System.out.print(s+" ");
		}
		System.out.println();

		
		System.out.println("------------ Using Iterator --------------------");
		
		Iterator<String> itr = cols.iterator();
		
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		System.out.println();

		
		System.out.println("---------------- Using list Iterator ----------------------");
		
		ListIterator<String> litr = cols.listIterator(cols.size());
		
		while(litr.hasPrevious())
		{
			System.out.print(litr.previous()+" ");
		}
		System.out.println();

		System.out.println("-------------- Using Enumeration ------------------");
		
		Enumeration<String> en = cols.elements();
		
		while(en.hasMoreElements())
		{
			System.out.print(en.nextElement()+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
