package com.queue;


class Myqueue
{
	int front,rear;
	int[] arr;
	int size;
	
	Myqueue()
	{
		
	}
	
	Myqueue(int size)
	{
		this.front=0;
		this.rear=0;
		this.size=size;
		this.arr= new int[this.size];
		
	}
	
	public void insert(int data)
	{
		arr[rear]= data;
		rear++;
	}
	
	public void display()
	{
		if(rear>front) {
			
			for(int i=front;i<rear;i++)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}else
		{
			System.out.print("Queue is empty");
		}
	}
	
	public void delete()
	{
		int  i;
		if(rear>front)
		{
			for(i=front;i<rear-1;i++)
			{
				arr[i]=arr[i+1];
			}
			arr[--rear] =0;
		}
		else
		{
			System.out.println("Queue is empty");
		}
	}
	
	
}

public class QueueImpl {

	public static void main(String[] args) {
		
		Myqueue q = new Myqueue(7);
		q.insert(10);
		q.insert(3);
		q.insert(6);
		q.insert(19);
		q.insert(398);
		
		q.delete();
		q.delete();
		q.display();
		q.delete();
		
		q.display();
		

	}

}
