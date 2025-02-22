package com.neotech.lesson05;

public class ElseIfCondition {

	public static void main(String[] args) {

		double d1 = 39.5;
		double d2 = 39.5;

		// d1 migth be larget than d2
		// d2 might be larger than d1
		// d1 and d2 are equal

		if (d1 > d2) // the code will only rin if d1 is larger than d2
		{
			System.out.println("Number " + d1 +  "is larger than " + d2);

		}

		else if (d1 < d2) {
			System.out.println("Number " + d2 + " is larger than " + d1);
		}

		else {
			System.out.println("Number " + d1 + " is equal to " + d2);
		}

		
		System.out.println("-------------------------------------------------");
		
	}

	// this is the end of the code as well, // we can print a line here

}
