package com.neotech.lesson34;

public class IntroToExceptions {

	public static void main(String[] args) throws Exception {

		int a = 10;
		int b = 0;

		// System.out.println(a / b);// ArithmeticException

		int[] array = { 1, 2, 3, 4 };
		// System.out.println(array[6]); // Index 6 out of bounds for length 4

		String filePath = "";
		// FileInputStream fis = new FileInputStream(filePath); // checked exception

		Exception e = new Exception();
		// throw(e); // cause an exception to happen

		NullPointerException npe = new NullPointerException();
		throw (npe);

		// System.out.println("End of code! ");

		// Whenever an exception happens, if not handled, the code execution stops right
		// away

	}

}
