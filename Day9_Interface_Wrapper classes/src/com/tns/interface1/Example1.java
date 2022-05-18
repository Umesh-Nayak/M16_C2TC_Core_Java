package com.tns.interface1;

public interface Example1 
{
	public void print();	
}
class A implements Example1
{
	public void print()
	{
		System.out.println("This is the C2TC program");	
	}
	public static void main(String args[])
	{
		A obj=new A();
		obj.print();
	}
}
