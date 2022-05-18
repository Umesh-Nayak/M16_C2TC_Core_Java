package com.tns.collection;


import java.util.LinkedHashSet;
import java.util.Set;

public class Example3 {

	public static void main(String[] args) {
		Set<Integer> s=new LinkedHashSet<Integer>();
		s.add(10);
		s.add(null);
		System.out.println(s);

	}

}
