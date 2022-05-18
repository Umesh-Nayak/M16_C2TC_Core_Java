package com.tns.collection;

//import java.util.Map;
import java.util.SortedMap;
//import java.util.NavigableMap;
import java.util.TreeMap;

public class Example6 {

	public static void main(String[] args) {
		SortedMap<Integer, String>s=new TreeMap<Integer,String>();
		s.put(3, "Umesh");
		s.put(1, "Akshay");
		s.put(2, "Rohit");
		//s.remove(1);
		System.out.println(s);
		//System.out.println(s.lastEntry());

	}

}
