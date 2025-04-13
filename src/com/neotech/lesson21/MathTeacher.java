package com.neotech.lesson21;

public class MathTeacher extends Teacher {

	boolean goodwithNumbers;

	public void teachesMath() {
		System.out.println(name + " " + lastName + " teaches Math! ");
	}

	public static void main(String[] args) {

		MathTeacher mt = new MathTeacher();

		mt.age = 45;
		mt.gender = 'F';
		mt.goodwithNumbers = true;
		mt.lastName = "Ruiz";
		mt.name = "Jaqui";

		mt.teaches(); // from the parent class
		mt.teachesMath(); // from the child class
		
		
		

	}

}
