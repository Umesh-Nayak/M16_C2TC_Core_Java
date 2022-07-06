package com.google.p1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArrayForIntegerAsList  {
	
	
	
	public static void main(String[] args)throws java.lang.Exception {
		Integer[] inputArray = {5,25,55,321};
		
		System.out.println("Array without reverse"+ Arrays.toString(inputArray));
		
		reverseArray(inputArray);
	}
	public static void reverseArray(Integer[] arr) {
		
		List<Integer>list = Arrays.asList(arr);
		
		Collections.reverse(list);
		
		System.out.println("Reverse Array :");
		for(Integer val : list)
			System.out.print(" "+val);
		
	}

}
