package com.neotech.lesson29;

import java.util.ArrayList;

public class Drinks {

	/*
	 * 
	 * Homework 3: Create a class Insurance that will have an attribute as
	 * insuranceName and unimplemented behaviour as getQuote() and
	 * cancelInsurance(). 
	 * Create 3 subclasses Car, Pet, Health. 
	 * Car class has its own attribute as carModel and Class Pet has petType attribute. 
	 * Create 3 objects of the sub classes and store them in ArrayList. Using for
	 * loop/advanced for loop/iterator access all methods of the class.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * Homework 4: Create a Card class that will have implemented and unimplemented
	 * methods and a constructor that will initializes credit card type. Create 3
	 * subclasses of a Card card. Create 3 objects of different card and store them
	 * into LinkedList. Using for loop/advanced for loop/iterator access all methods
	 * of the class.
	 */

	String drinks;

	public Drinks(String drinks) {
		this.drinks = drinks;

	}

	public void drinksInfo() {
		System.out.println("the drink is " + drinks);
	}

	public String forString() {
		return drinks;
	}

	public static void main(String[] args) {

	}

}
