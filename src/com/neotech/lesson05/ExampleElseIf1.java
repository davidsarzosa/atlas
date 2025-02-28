package com.neotech.lesson05;

public class ExampleElseIf1 {

	public static void main(String[] args) {

		int age = 19;

		if (age < 13) {
			System.out.println("child");
		} else if (age < 20) {
			System.out.println("Teenager");
		} else if (age < 65) {
			System.out.println("Adult");
		} else {
			System.out.println("Senion Citezin");

		}

		System.out.println("This is why elseIF confition can be used to check Range, whereas Switch cannot");

	}

	
}
