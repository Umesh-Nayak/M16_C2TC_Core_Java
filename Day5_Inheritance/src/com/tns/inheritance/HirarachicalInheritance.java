package com.tns.inheritance;
class Vehicle
{
	void print()
	{
		System.out.println("Vehicle Types");
	}
}
class Car extends Vehicle
{
	void display1()
	{
		System.out.println("Mercedez-Benz");
	}
}
class Bike extends Vehicle
{
	void display1()
	{
		System.out.println("R15");
	}
}
	
public class HirarachicalInheritance {

	public static void main(String[] args) {
		Bike b=new Bike();
		Car c=new Car();
		b.print();
		b.display1();
		c.display1();
		
	}

}
