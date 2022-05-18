package com.tns.recursion;

public class FibonacciSeries {
		static int a=1,b=2,c;
		void printfib(int i)
		{
			if(i>=1)
			{
				c=a+b;
				System.out.print(" " +c);
				a=b;
				b=c;
				printfib(i-1);
			}
		
		
	 }    
	 public static void main(String args[]){    
	  System.out.print(a+" " +b);
	  FibonacciSeries f=new FibonacciSeries();
	  f.printfib(10);
	 }  
	}  