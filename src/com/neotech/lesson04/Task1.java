package com.neotech.lesson04;

public class Task1 {
	
	public static void main(String[] args) {
		
		/*
		 * Task 1: 
		 * Create an int variable named number1, assign the value of 500.
		 * 
		 * Store/assign number1 into a byte variable named number2.
		 * 
		 * Re-assign the number1 into number2. Print the value of number2. 
		 * Check if it is 500. What if the initial value was 50?
		 */
		
		
		int number1= 512; // 
		
		System.out.println(number1);
		
		byte number2 = (byte)number1; // narrowing 
		
		System.out.println(number2);

		 number1 = 50; // reassigning
		 
		 number2 = (byte)number1; // reassigning the value of number2 -- > casting again
		 
		 System.out.println(number2);
		 
		 
		 
		 
		 
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
