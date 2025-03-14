package com.neotech.lesson11;

import java.util.Scanner;

public class homework3 {
	
	public static void main(String[] args) {

		/*
		 * Ask the user to enter an integer and build the following pattern: 
		 * Hint: Use  scanner, if user entered number 5, there should be two parts 	 
		 * The first part, 1 to 5 
		 * The second part, 4 to 1
		 * 
		 */
		// 1
		// 1 2
		// 1 2 3
		// 1 2 3 4
		// 1 2 3 4 5
		// 1 2 3 4
		// 1 2 3
		// 1 2
		// 1
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		
		
		for(int i = 1; i <= num; i++)
		{
			//this loop, should run only once on the first row
			//this loop, should run only twice on the second row
			for (int j = 1; j <= i; j++)
			{
				System.out.print(j + " ");
			}
			
			
			//hit enter - this will define how many rows I have
			System.out.println();
		}
		
		
		for (int i = num-1; i >= 1; i--)
		{
			
			for (int j = 1; j <= i; j++)
			{
				System.out.print(j + " ");
			}
			
			
			System.out.println();
		}
	}


}
