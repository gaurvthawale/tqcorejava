package com.stack;



class MyStack
{
	int top;
	int[] stk;
	int size;
	
	MyStack(int size)
	{
		top=-1;
		this.size=size;
		stk = new int[this.size];
	}
	
	public void push(int data)
	{
		if(top<size-1)
		{
			top++;
			stk[top]=data;
			
			System.out.println("element inserted");
		}
		else
		{
			System.out.println("stack overflow");
		}
		
	}
	
	public void pop()
	{
		if(top!=-1)
		{
			System.out.println("Element deleted:"+stk[top]);
			top--;
		}
		
		else
		{
			System.out.println("stack underflow");
		}
		
	}
}

public class StackImpl {

	public static void main(String[] args) {
		
		MyStack s1 = new MyStack(4);
		
		s1.push(10);
		s1.push(30);
		s1.pop();
		s1.pop();

	}

}
