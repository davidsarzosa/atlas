package com.neotech.lesson05;

public class ElseIfCondition {

	public static void main(String[] args) {

//		double d1 = 39.5;
//		double d2 = 39.5;

		// d1 migth be larget than d2
		// d2 might be larger than d1
		// d1 and d2 are equal

//		if (d1 > d2) // the code will only run if d1 is larger than d2
//		{
//			System.out.println("Number " + d1 +  "is larger than " + d2);
//
//		}
//
//		else if (d1 < d2) {
//			System.out.println("Number " + d2 + " is larger than " + d1);
//		}
//
//		else {
//			System.out.println("Number " + d1 + " is equal to " + d2);
//		}
//
		System.out.println("-------------------------------------------------------------------");

		double d1 = 39.5;
		double d2 = 39.5;

		if (d1 > d2) {
			System.out.println("number1 " + d1 + " is bigger than " + d2);

		} else if (d1 < d2) {
			System.out.println("number1 " + d1 + "is smalles than " + d2);
		} else {
			System.out.println("Non of them are numbers they are apples");
		}
		System.out.println("-------------------------------------------------------------------");

		int atxPort = 10;
		int nycPort = 20;

		System.out.println("We are tring to check if the ATX Port is bigger than NYC Port ");

		if (atxPort < nycPort) {
			System.out.println("This is correct because atxPort = " + atxPort + " and nycPort = " + nycPort);
		} else if (atxPort > nycPort) {
			System.out.println("This is wrong because atxPort = " + atxPort + " and nycPort is = " + nycPort);
		} else {
			System.out.println("This is not a port this is a highway");
		}

		System.out.println("-------------------------------------------------------------------");

	}

	// this is the end of the code as well, // we can print a line here

}
