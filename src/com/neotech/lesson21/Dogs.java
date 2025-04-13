package com.neotech.lesson21;

public class Dogs extends Animal {

	// by using extend, we get all attributes and behaviors
	// of the Animal class

	// dog specific property
	String breed;

	// dog specific behavior
	public void barks() {
		System.out.println("Only dog barks ");
		System.out.println("The breed is: " + breed);
		System.out.println("The name is " + name);

	}

}
