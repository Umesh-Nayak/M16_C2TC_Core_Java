package com.tns.strings;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		String s1 = "Dhoni";
		String s2 = s.next();
		if(s1.equals(s2)) {
			System.out.println("Matching");
		}
		else {
			System.out.println("Not Matching");
		}
		
	}

}
