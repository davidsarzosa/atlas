package com.neotech.lesson18;

public class LocalVariables {

	public static void main(String[] args) {

		LocalVariables lv = new LocalVariables();
		lv.method1();
		lv.method2();
		System.out.println();
		System.out.println("-----------------------");

		boolean flag = true;
		// the lifetime of the local variable flag is the lifetime of the main method
		// when main method finished execution, flag is also destroyed.

		if (flag == true) { // the lifetime of it statement starts here
			String answer = "yes"; // local to if statement only, not to the main method
			System.out.println(answer);
			System.out.println(flag);
		} // the lifetime of if statement ends here
		System.out.println("-----------------------");

		// System.out.println(answer);

		for (int i = 0; i < 5; i++) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("-----------------------");

		// can i use i here ?
		// no, we can not. its lifetime ends with the for loop

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(i + " " + j);

			}
			System.out.println(i);
			// System.out.println(j); // the lifetime of j ended with the execution of the
			// inner loop

		}

	}

	void method1() {
		String name = "Viviana";
		int age = 25;
		System.out.println(name);
		System.out.println(age);

	} // the local variables are destroyed here

	void method2() {
		String name = "Emma";
		System.out.println(name);

	}

}
