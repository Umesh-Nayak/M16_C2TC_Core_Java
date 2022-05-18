package com.tns.interface1;

interface Mother 
{
	void display();
}
interface Father
{
	void display();
}
class Son implements Mother,Father
{
	public void display()
	{
		System.out.println("Mother");
	}
	public void display1()
	{
		System.out.println("Father");
	}
	public static void main(String[] args)
	{
		Son s=new Son();
		s.display();
		s.display1();
		
	}
}
