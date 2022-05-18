package com.tns.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class Example1 {

	public static void main(String[] args) {
		Queue<Integer>Q=new PriorityQueue<Integer>();
		Q.add(1);
		Q.add(22);
		Q.add(33);
		System.out.println(Q);
		//System.out.println(Q.peek());//it will use to peek 1st element from array.
		//System.out.println(Q.poll());//it will remove the 1st element
	}

}
