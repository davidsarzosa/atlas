package com.neotech.lesson19;

public class Employee {

	// Access Modifiers: public, protected, default, private

	public static String company;
	public String name;
	protected String lastName;
	double salary; // if not access modifier is provided then is: default
	private int ssn;

//formula:
//	OPTIONAL		MUST		MUST		OPTIONAL    OPTIONAL
//AccessModifier	dataType 	variableName		= 		value ;	

	// methods with different access modifiers

	public void method1() {
		System.out.println("I am a public method");
	}

	protected void method2() {
		System.out.println("I am a protected method! ");
	}

	void method3() {
		System.out.println("I am a default method! ");
	}

	private void method4() {
		System.out.println("I am a private method! ");

	}

	public static void main(String[] args) {

		Employee emp = new Employee();

		company = "Atlas";
		emp.name = "Mateo";
		emp.lastName = "Espinosa";
		emp.salary = 85.500;
		emp.ssn = 78742124;

		// lets try it for methods

		emp.method1();
		emp.method2();
		emp.method3();
		emp.method4();

	}

}
