package com.tns.this1;

public class Example3 
{
	void accept(Example3 obj)
	{
		System.out.println("Welcome to C2TC Program");
	}
	void print()
	{
		accept(this); //we can passed same object by using "this" keyword
	}

	public static void main(String[] args) 
	{
		Example3 e=new Example3();
		e.print();
	}

}
