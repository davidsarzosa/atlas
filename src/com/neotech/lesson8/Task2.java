package com.neotech.lesson8;

public class Task2 {

	/*
	 * Create a boolean variable workDay and assign it true create int variable day
	 * and assign it to 1 - As long as it is workDay print "I need a day off" and
	 * increase day. - Once day is 6 print "I do not need a day off any more"
	 */
	public static void main(String[] args) {

		boolean workDay = true;

		int day = 1;

//		while (day < 6) {
//			System.out.println(day + " I need a day off ");
//			day += 1;
//		}
//		while (day > 5) {
//			System.out.println(day + " I do not need a day off any more");
//			day += 1;
//
//		}

		while (workDay) {
			if (day <= 6) {
				System.out.println("I need a day off ");

			} else {
				System.out.println("I dont need a day off anymore ");
				workDay = false;
			}

			day++;

		}

	}

}
