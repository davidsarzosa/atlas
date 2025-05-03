package com.neotech.lesson26;

public class Employee {

	private String name;
	private int  age;
	private double salary;

	// we put the variables as private
	// I can only access them from within the class

	// there can be two situations
	// 1 - Someone needs to get the value of a parameter
	// - We will create getter
	// 2 - Someone needs to set the value of a parameter
	// - We will create setter

	// for every variable I can define a getter and setter
	// but it is NOT required

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

	// setter for name

	/*
	 * If you want to be able to set the name, you have to send a String that is not
	 * empty and is at least 2 characters
	 * 
	 * @param name
	 * 
	 */
	public void setName(String name) {
		if (!name.isEmpty() && name.length() >= 2) {
			this.name = name;
		}

	}

	// setter for age

	public void setAge(int age) {
		this.age = age;
		
	}
	
	// setter for salary 
	public void setSalary(double salary) {
		this.salary = salary;
		
	}
	
	

}
