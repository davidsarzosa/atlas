package com.neotech.lesson05;

public class SwitchExample {

	public static void main(String[] args) {

		String grade;
		int score = -1;

		switch (score / 10) {
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		case 5:
			grade = "E";
			break;
		default:
			grade = "F Fail)";
		}

		System.out.println("Grade:" + grade);

	}
}
