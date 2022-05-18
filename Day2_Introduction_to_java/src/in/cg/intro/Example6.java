package in.cg.intro;

import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);  
		System.out.print("Enter a string: ");  
		String str= sc.nextLine();              
		System.out.print("You have entered: "+str);
		sc.close();
		
	}

}
