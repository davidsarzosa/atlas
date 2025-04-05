package com.neotech.lesson18;

public class Cat {

	String name;
	int weight;
	String color;

	void sayMeow() {
		String word = "Meow! ";
		System.out.println(word);
	}

	void displayCatInfo() {
		System.out.print("My cat name is " + name + " weight is " + weight +" pounds " +",cat color is " + color);
	}

}
