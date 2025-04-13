package com.neotech.lesson22;

public class Parent {

	String name = "Parent Name";
	String lastName = "Parent LastName";

	void hello() {
		System.out.println("Hello I am the partent class");
	}

}

class Child extends Parent {

	String name = "Child Name";
	String lastName = "Child LastName";

	void hello() {
		System.out.println("I am the child class! ");
	}

	void display() {
		System.out.println(name); //
		System.out.println(super.name); // Super refers to the parent class
		System.out.println(super.lastName); // Super refers to the parent class you do not have to use super but if you
		System.out.println(lastName);

	}

	void sayHello() {

		display();
		hello();
		super.hello();

	}

}
