package com.neotech.lesson26;

public class Employee {

	private String name;
	private int age;
	private double salary;

	// we put the variables as a private
	// - I can only access them from within the class
	// 1- Someone needs to get the value of a parameter
	// - we will create a getter
	// 2 - Someone need to set the value of a parameter
	// we will create a setter

	// getter for name
	public String getName() {
		return name;
	}

	// getter for age
	public int getAge() {
		return age;

	}

	// getter for salary
	public double getSalary() {
		return salary;
	}

	// Setter for name
	/*
	 * if you want to be able to set the name, you have to send a String that is not
	 * empty and is at least 2 characters
	 * 
	 * @param name
	 * 
	 */

	// Setter for name
	// I want to allow this only if the String sent
	// is not empty and is at least 2 characters

	public void setName(String name) {
		if (!name.isEmpty() && name.length() >= 2)
			this.name = name;

	}

	// Setter for age
	public void setAge(int age) {
		this.age = age;

	}

	// Setter for salary
	public void SetSalary(double salary) {

		this.salary = salary;
	}

}
