package com.tns.this1;
// to invoke the current class of constructor by using this keyword

public class Example5 
{
	int a;
	Example5()
	{
		this(25);
		System.out.println("Age1");
	}
	Example5(int a)
	{
		this.a=a;
		System.out.println("Age2");
	}

	public static void main(String[] args)
	{
		Example5 e=new Example5();
		

	}

}
