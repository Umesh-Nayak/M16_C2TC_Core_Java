package com.tns.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class Example1 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Queue Q=new PriorityQueue ();
		Q.add(11);
		Q.add(2);
		Q.add(33);
		System.out.println(Q);
		Q.peek();
		//Q.poll();
		//Q.poll();
		System.out.println(Q);
		
	}

}
