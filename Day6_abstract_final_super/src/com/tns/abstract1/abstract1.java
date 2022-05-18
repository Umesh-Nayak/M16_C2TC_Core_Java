package com.tns.abstract1;

abstract class A
{
	abstract void print();
	
}
class B extends A
{
	void print()
	{
		System.out.println("Welcome to JFS program");
	}
}
public class abstract1 {

	public static void main(String[] args) {
		A obj=new B();
		obj.print();
		
	}

}
