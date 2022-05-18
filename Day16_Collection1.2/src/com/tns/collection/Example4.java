package com.tns.collection;

import java.util.HashSet;
import java.util.Set;

public class Example4 {
	//sets are unique
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Set s=new HashSet();
		//HashSet s=new HashSet();
		//LinkedHashSet s=new LinkedHashSet();
		s.add(1);
		s.add(5);
		s.add(3);
		s.add(null);
		System.out.println(s);

	}

}
