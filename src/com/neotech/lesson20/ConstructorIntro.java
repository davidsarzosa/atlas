package com.neotech.lesson20;

public class ConstructorIntro {

	// some features:
	String name;
	int age;

	// declaring a constructor:
	// name of the constructors has to be same with the name of the class
	// there is no return type for constructor

	ConstructorIntro() {
		System.out.println("I am the default constructor! ");

	}

	public static void main(String[] args) {

		ConstructorIntro con = new ConstructorIntro();
		ConstructorIntro con2 = new ConstructorIntro();

		con.name = "Maria";
		con.age = 25;

		System.out.println(con.name + " " + con.age);
		
	}

}
