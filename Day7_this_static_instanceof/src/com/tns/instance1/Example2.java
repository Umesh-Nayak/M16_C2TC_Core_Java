package com.tns.instance1;
class Example2
{
	void print()
	{
		System.out.println("Hello");
	}
}
class Example3 extends Example2 {

	public static void main(String[] args) {
		Example3 e=new Example3();
		System.out.println(e instanceof Example2);

	}

}
