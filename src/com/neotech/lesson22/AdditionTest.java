package com.neotech.lesson22;

public class AdditionTest {

	public static void main(String[] args) {

		Addition obj = new Addition();

		obj.add(5, 20);
		obj.add(23, 56, 76);

		obj.add(34.2, 12.6);
		obj.add(54.3, 23.4, 12.9);

		obj.add(23.4, 1);
		obj.add(4, 45.1);

		// Strings
		obj.add("Jose", 12);
		obj.add(34, "Maria");

	}

}
