package com.stack;

import java.util.Enumeration;
import java.util.Stack;

public class StackInBuilt {

	public static void main(String[] args) {
		
		Stack<String> stk = new Stack<>();
		
		stk.push("agaurav");
		stk.push("mohit");
		stk.push("rushikesh");
		stk.push("vaubhav");
		stk.push("jadu");
		System.out.println(stk);
		
		System.out.println(stk.peek());
		System.out.println(stk.pop());

		System.out.println(stk.pop());

		System.out.println(stk.peek());
		
		Enumeration<String> en = stk.elements();
		
		while(en.hasMoreElements())
		{
			System.out.print(en.nextElement()+" ");
		}

		

	}

}
