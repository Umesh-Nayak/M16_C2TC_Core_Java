package com.tns.collection;

import java.util.PriorityQueue;


public class Example2 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		PriorityQueue Q=new PriorityQueue ();
		Q.add(17);
		Q.add(22);
		Q.add(5);
		System.out.println(Q);
		//System.out.println(Q.element());//for getting head element of the array
		//System.out.println(Q.peek());//for peeking 1st element
	}

}
