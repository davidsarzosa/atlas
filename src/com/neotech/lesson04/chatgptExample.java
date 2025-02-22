package com.neotech.lesson04;

public class chatgptExample {

	public static void main(String[] args) {

		// NarrowingExample

		int largeNumber = 130; // More than byte range (-128 to 127)
		byte smallNumber = (byte) largeNumber; // Explicit cast required

		System.out.println("Original int value :" + largeNumber);
		System.out.println("Converted byte value : " + smallNumber);

	}

}




