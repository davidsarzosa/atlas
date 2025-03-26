package com.neotech.lesson16;

public class Student {

	/*
	 * Create a class Student that will have a method getGrade. Your method should
	 * accept the score of a student and return a grade: score > 90 - A score > 80 -
	 * B score > 70 - C score > 50 - D anything else - F
	 * 
	 */

	// Do do I need to know to create a method ?

	// Remember: Input ---> Action ----> Output

	// What is / are the inputs on this method ? Student score (Int)
	// What is the action to be performed ?? Based on the scores, calculate letter
	// grade.
	// What is the output (return type)?? Student Letter Grade(Char)

	// return type methodName(---- Inputs --- )
	// {
	// code logic

	// return statment

	// }

	char getGrade(int score) {

		// what is the way that I should follow to perform the action needed ?
		char grade;

		if (score > 90) {
			grade = 'A';
		} else if (score > 80) {
			grade = 'B';
		} else if (score > 70) {
			grade = 'C';
		} else if (score > 50) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		return grade;
	}

	public static void main(String[] args) {

		// to be able to access the method I need a student object

		Student st = new Student();

		st.getGrade(80);
		char finalGrade = st.getGrade(35);

		System.out.println("The student grade is: " + finalGrade);

	}

}
