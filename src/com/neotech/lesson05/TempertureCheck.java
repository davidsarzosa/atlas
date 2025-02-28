package com.neotech.lesson05;

public class TempertureCheck {

	public static void main(String[] args) {

		/*
		 * 2. Create a Java program and name it Temperature Check. Create variable to
		 * store temperature. Your program should check if temperature is below 32 If
		 * temperature is below then it should print “Water will freeze with
		 * temperature__”, otherwise “Water will NOT freeze with temperature __”.
		 */

		int t = 30;

		if (t < 32) {
			System.out.println("Water will freeze with " + " temperature " + t);
		} else {
			System.out.println("Water will NOT freeze with temperature " + t);
		}

	}

}
