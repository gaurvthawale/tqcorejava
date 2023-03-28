package com.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

class MyCompararor implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		if(o1==o2)
		return 0;
		else if(o1>o2)
			return 1;
		else 
			return -1;
	}
	
}

public class DemoPriorityQueue {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new MyCompararor());
		pq.add(20);
		pq.add(60);
		pq.add(10);
		pq.add(80);
		pq.add(5);
		
		System.out.println(pq);

	}

}
