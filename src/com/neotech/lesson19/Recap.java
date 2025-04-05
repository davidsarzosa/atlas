package com.neotech.lesson19;

public class Recap {

	// This is cooming from a Employee class
	// Remember you have access modifiers : Public, Static, Private, Default;

	public static String Company = "DaliFlowers"; // make this private
	public String name; // this is defaul
	String lastName; // this is protected
	double salary; // this is default
	private int ssn; // this is private no one can see this

	// again the access modifiers are private, protected, public, default;

	// OPTIONAL / MUST / MUST / OPTIONAL / OPTIONAL
	// AccessModiffier / dataType / variableName / = / value
	// public / static /String / Company /=;
	// private / / / /
	// default / / / /
	// protected / / / /

	// methods with different access modifiers
	public void method1() {
		System.out.println("Im a public method! from RECAP");
	}

	private void method2() {
		System.out.println("Im a protected method! from RECAP ");
	}

	protected void method3() {
		System.out.println("Im a protected method! from RECAP  ");
	}

	void method4() {
		System.out.println("Im a default method! from RECAP ");
	}

	// now what we can do with this methods ?
	public static void main(String[] args) {

		// we need to call the class fist to have access to it!

		Recap recapClass = new Recap();
		System.out.println(Company);
		System.out.println(Company = "Atlass"); // when you have a static variable you have to access this way to it.
		System.out.println(Company = "DaliFlowers");
		System.out.println();
		System.out.println(recapClass.name = "Jorge");
		System.out.println(recapClass.lastName = "Espinosa");
		System.out.println(recapClass.ssn = 737291647);
		System.out.println(recapClass.salary = 34.565);

		recapClass.method1();
		recapClass.method2();
		recapClass.method3();
		recapClass.method4();

		System.out.println("-----------------------------------------------------------");

		// This class is EmployeeWith Package Example

	}
}
