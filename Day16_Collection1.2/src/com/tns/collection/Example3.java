package com.tns.collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class Example3 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Deque d=new ArrayDeque();
		d.add(13);
		d.add("abcdef");
		//System.out.println(d);
		d.addFirst(15);
		d.addLast("xyz");
		System.out.println(d);
		d.removeFirst();
		System.out.println(d);
		d.removeLast();
		System.out.println(d);
		

	}

}
