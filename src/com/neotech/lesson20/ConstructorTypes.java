package com.neotech.lesson20;

public class ConstructorTypes {

	String program;
	String name;
	int age;

	// default constructor
	// no return type
	// must have the same name as the class
	// no parameters

	ConstructorTypes() {
		System.out.println("I am default consturctor");
	}

	// we may have several consturcor methods
	// with different signatures

	ConstructorTypes(String str) {
		System.out.println("I am a constructor with a string " + str);

	}

	ConstructorTypes(int num) {
		System.out.println("I am a constructor with int " + num);
	}

	ConstructorTypes(String str, double dbl) {
		System.out.println("I am a consturctor with  string and double " + str + " " + dbl);
	}

	ConstructorTypes(String str, String str2, int num) {
		System.out.println("I am a constructor with a string1, string2,  and integer: " + str + " " + str2 + " " + num);
		name = str;
		program = str2;
		age = num;

	}

	ConstructorTypes(String str1, String str2) {
		System.out.println("I am a constructor with two strings " + str1 + " " + str2);

	}

	public static void main(String[] args) {

		// using the constructors
		ConstructorTypes ct1 = new ConstructorTypes(" Ligia ", 54);
		// System.out.println(ct1.name + " " + ct1.age);
		ConstructorTypes ct2 = new ConstructorTypes("Dennis", 34.6);
		ct2.age = 34;
		System.out.println(ct2.name = "Dennis" + " " + ct2.age);
		ConstructorTypes ct3 = new ConstructorTypes("PL1", "QUITO", 138);
		System.out.println(ct3.name + " " + ct3.program + " " + ct3.age);
		ConstructorTypes ct4 = new ConstructorTypes(54);
		// ConstructorTypes ct5 = new ConstructorTypes("Juan", "Ligia", "Consuelo");
		// this will tell you this constructor is not found, so you if you want you can
		// create it!

	}

}
