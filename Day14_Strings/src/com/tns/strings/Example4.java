package com.tns.strings;

public class Example4 {

	public static void main(String[] args) {
		String str="Umesh";
		String str1="Nayak";
		System.out.println(str.charAt(4));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str+" "+str1);
		System.out.println(str+" ".concat(str1));
		String s= 50 + 50 + "error" + 50 + 50 + 20;
		System.out.println(s);	
	}

}
