package com.google.p1;

import java.util.Arrays;

public class ReverseArrayForInteger {
	
	  
    public static void reverseArray(int[] inputArray) {
        for (int left = 0, right = inputArray.length - 1; 
                        left < right; left++, right--) {
            // swap the values at the left and right indices
            int temp = inputArray[left];
            inputArray[left]  = inputArray[right];
            inputArray[right] = temp;
        }
        // Printing the Array after reverse  
        System.out.print("Reverse Array :");
        for(int val : inputArray)
            System.out.print(" "+val);
    
}

	public static void main(String[] args) throws java.lang.Exception
	{
		 
		        // Given input array 
		        int[] inputArray = {45,89,247,8752,14141}; 
		        // Print array before reverse  
		        System.out.println("Array without reverse" + Arrays.toString(inputArray)); 
		        // Calling method to swap elements 
		        reverseArray(inputArray);
		        }
	
}