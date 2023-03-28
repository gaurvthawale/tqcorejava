package com.queue;


import java.util.ArrayDeque;




public class DemoArrayDeque {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> pq = new ArrayDeque<Integer>();
		pq.add(20);
		pq.add(60);
		pq.add(10);
		pq.add(80);
		pq.add(5);
		
		pq.push(20);

		pq.push(110);
		pq.poll();
		System.out.println(pq);

	}

}
