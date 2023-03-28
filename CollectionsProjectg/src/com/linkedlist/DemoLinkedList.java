package com.linkedlist;

import java.util.LinkedList;

public class DemoLinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> names = new LinkedList<>();
		
		names.add("gaurav");
		names.add("pratik");
		names.add("milind");
		names.add("vaibhav");
		names.add(1,"jadu");
		
		System.out.println(names);
		names.addFirst("prasanna");
		names.offerFirst("srinivas");
		
		names.addLast("kishor");
		names.offerLast("shahrukh");
		System.out.println(names);
		System.out.println();

		
		System.out.println("get method");
		System.out.println(names.get(3));
		System.out.println(names.getFirst());
		System.out.println(names.getLast());
		System.out.println();
		
		System.out.println("peek method");
		System.out.println(names.peek());
		System.out.println(names.peekFirst());
		System.out.println(names.peekLast());
		System.out.println();

		
		System.out.println("poll method");
		System.out.println(names.poll());
		System.out.println(names.pollFirst());
		System.out.println(names.pollLast());
		

	}

}
