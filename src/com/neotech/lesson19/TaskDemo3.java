package com.neotech.lesson19;

public class TaskDemo3 {

	public static void main(String[] args) {

		// delcaring the value of the array while passing the argument's values.

		Task3 obj = new Task3();
		int[] array = { 87, 654, 221, 32, 54, 4 };

		int sum = obj.sum(array);
		System.out.println("The total sum of the array is: " + sum);
	}

}
