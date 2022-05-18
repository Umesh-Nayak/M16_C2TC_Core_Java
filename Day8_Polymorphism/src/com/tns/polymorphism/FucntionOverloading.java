package com.tns.polymorphism;

//Function overloading

class Shape
{
	void print (int a, int b) //different data types
	{
		System.out.println(a*b);
	}
	void print (float a, float b) // different data types
	{
		System.out.println(a*b);
	}
	void print(int l, int b, int h) // different arguments
	{
		System.out.println(l*b*h);
	}
}

public class FucntionOverloading 
{
	

	public static void main(String[] args) 
	{
		Shape s=new Shape();
		s.print(10,20);
		s.print(5.3f, 20.6f);
		s.print(10,20,30);
	}

}
