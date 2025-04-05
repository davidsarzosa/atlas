package com.neotech.lesson19;

public class Task3 {

	/*
	 * Create a method that will accept an array as parameter and will return the
	 * sum of all elements from that array. Method should be visible only within the
	 * same package and accessible by creating an instance of the class. Call this
	 * method from inside the class and another class in the same package.
	 * 
	 */

	int sum(int myArray[]) {
		int sum = 0;
		for (int el : myArray) {
			sum += el;
		}
		return sum;
	}

	public static void main(String[] args) {

		Task3 obj = new Task3();
		int array[] = { 23, 24, 25, 26 };

		int sum = obj.sum(array);
		System.out.println("The total sum of the array is " + sum);

	}

}
