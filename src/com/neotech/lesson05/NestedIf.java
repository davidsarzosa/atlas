package com.neotech.lesson05;

public class NestedIf {

	public static void main(String[] args) {

		// Write a Java Program to check if the student has completed the quiz.
		// if the student did the quiz, then check the score and give these evaluations:
		// if the score is 90 or above 90, then print "A, Great Job"
		// if the score is 80 to 90[, then print "B, Well Done!"
		// if the score is 70 to 80[, then print "C, You Passed!"
		// Otherwise, print "Try harder next time".

//		boolean studentQuize = true;
//		int score = 90;
//
//		if (studentQuize) {
//			if (studentQuize && score >= 90) {
//				System.out.println(" A, Greate Job!");
//			} else if (score >= 80) {
//				System.out.println("B, Well done!");
//			} else if (score >= 70) {
//				System.out.println("You Passed!");
//			} else {
//				System.out.println("Try harder next time");
//			}
//
//		}
//
//		System.out.println("You did not do the quiz, so you failed!");
//		
//		System.out.println("then now we can continue with a different language");

		// Write a Java Program to check if the student has completed the quiz.
		// if the student did the quiz, then check the score and give these evaluations:
		// if the score is 90 or above 90, then print "
		// if the score is 80 to 90[, then print
		// if the score is 70 to 80[, then print
		// Otherwise, print "".

		boolean studentDidQuize = true;

		int score = 90;

		if (studentDidQuize) {
			if (studentDidQuize && score >= 90) {
				System.out.println("A, Great Job, We have found a golden kid probably he is from Ecuador");
			} else if (studentDidQuize && score >= 80) {
				System.out.println("B, Well Done!");
			} else if (studentDidQuize && score >= 70) {
				System.out.println("C, You Passed!");
			} else if (studentDidQuize && score >= 60) {
				System.out.println("Try harder next time");
			} else {

				System.out.println("You did not did the quize because you are GAY");
				System.out.println("time to go home and cry a little bit and then come with more determination");
			}

		}

	}

}
