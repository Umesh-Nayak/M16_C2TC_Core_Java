package com.tns.static1;
//use block as static
public class Example3 
{
	static int x;
	static String str;
	static
	{
		x=10;
		str="cg";
	}

	public static void main(String[] args) 
	{
		System.out.println(x);
		System.out.println(str);
	}

}
