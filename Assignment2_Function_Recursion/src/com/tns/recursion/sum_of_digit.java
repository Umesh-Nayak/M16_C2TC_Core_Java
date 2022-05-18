package com.tns.recursion;

public class sum_of_digit {
	static int sod(int n)
	{
		if(n==0)
			return 0;
		return (n%10 + sod(n/10));
	}

	public static void main(String[] args) 
	{
		int num = 12345645;
		int result = sod(num);
		System.out.println("Sum of digits in "+ num + " is " +result);
		

	}

}
