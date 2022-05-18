package com.tns.inheritance;
class e1
	{
	public void print()
	{
		System.out.println("Sky");
	}
}
class e2 extends e1
{
	public void display()
	{
		System.out.println("Blood");
	}
}
class e3 extends e2
	{
		 public void display1()
		{
			System.out.println("Flower");
		}

	}
public class MultilevelInheritance {

	public static void main(String[] args) {
		e3 obj=new e3();
		obj.display();
		obj.display1();
		obj.print();
	}

}
