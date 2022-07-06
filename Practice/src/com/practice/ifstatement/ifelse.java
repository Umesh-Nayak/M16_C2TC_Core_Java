package com.practice.ifstatement;

import java.util.Scanner;

// if statement = performs a block of code if it's condition evaluates to be true

public class ifelse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your age is: ");
		int age = scanner.nextInt();
		
		
		 if(age>=60) {
			 
			 System.out.println("Ok Boomer!");	 
		 }
		 
		 else if(age<=7) {
			 System.out.println("You are a toddler!");
		 }
		 
		 else if(age>=18) {
			 System.out.println("You are an adult!");
			 
		 }
		 
		 else if(age>=13) {
			 System.out.println("You are a teenager!");
			 
		 }
		 
		 else {
			 System.out.println("You are not an adult");
		 }
		 scanner.close();
	}

}
