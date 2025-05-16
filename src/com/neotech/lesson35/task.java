package com.neotech.lesson35;

public class task {

	// Create a method to check age eligibility that will throw a runtime exception.
	// Method should throw an exception if age is less than 16.

	public static void main(String[] args) {
		try {
			CanYouDrive(10);

		} catch (YouCanNotDriveException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("End of code");

	}

	public static void CanYouDrive(int age) {
		if (age < 16) {
			System.out.println("You can NOT drive at " + age);
		} else {
			System.out.println("Drive Safe! ");
		}

	}

	class YouCanNotDriveException extends RuntimeException {
		public YouCanNotDriveException(String msg) {
			super(msg);
		}

	}
}
