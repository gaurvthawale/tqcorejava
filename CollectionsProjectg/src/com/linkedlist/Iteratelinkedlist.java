package com.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Iteratelinkedlist {

	public static void main(String[] args) {
		
		LinkedList<String> names = new LinkedList<>();
		
		names.add("gaurav");
		names.add("pratik");
		names.add("milind");
		names.add("vaibhav");
		names.add(1,"jadu");
		
		System.out.println(names);
		
	Iterator<String> litr0 = names.iterator();
		
		while(litr0.hasNext())
		{
			System.out.print(litr0.next()+" ");
		}
		
		System.out.println();
		System.out.println();
		Iterator<String> litr = names.descendingIterator();
		
		while(litr.hasNext())
		{
			System.out.print(litr.next()+" ");
		}
		
		System.out.println();
		ListIterator<String> litr1 = names.listIterator(names.size());
		
		while(litr1.hasPrevious())
		{
			System.out.print(litr1.previous()+" ");
		}
		
		System.out.println();
		ListIterator<String> litr2 = names.listIterator();
		
		while(litr2.hasNext())
		{
			System.out.print(litr2.next()+" ");
		}
		
		
	}

}
