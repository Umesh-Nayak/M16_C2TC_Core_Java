package com.tns.this1;

public class Example2 
{
	String str;
	Example2()
	{
		
	}
	Example2(String str)
	{
		this.str=str;  //This can be passed in constructor.
	}

	public static void main(String[] args) {
		Example2 e=new Example2("JAVA FULL STACK");
		System.out.println(e.str);

	}

}
