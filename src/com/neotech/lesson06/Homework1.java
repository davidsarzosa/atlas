package com.neotech.lesson06;

public class Homework1 {

	/*
	 * Write a java program to check if a patient has allergies. If the patient does
	 * not have allergies print "You’re healthy!".
	 * 
	 * If the patient has allergies, check if it is a peanut allergy, lactose
	 * allergy, bee allergy or seafood allergy and print a statement telling the
	 * patient "Don’t eat ___". (fill the line with the food names – peanut, seafood
	 * etc.)
	 */

	public static void main(String[] args) {

		boolean hasAllergy = false;
		boolean peanutA = true;
		boolean beeA = true;
		boolean seafood = true;
		boolean lactose = true;

		if (hasAllergy) { // this is a nessted if
			if (peanutA) {
				System.out.println("Dont eat peanut");
			}
			if (beeA) {
				System.out.println("Dont eat honney");
			}
			if (seafood) {
				System.out.println("Dont eat seafood");
			}
			if (lactose) {
				System.out.println("Dont eat lactose");
			}

		} else {
			System.out.println("You are good to go, you dont have any allergies ");
		}

		boolean hasMoneyAtTheBank = true;

		boolean bofa = false;
		boolean wellsFargo = false;
		boolean chase = true;
		boolean frost = false;

		if (hasMoneyAtTheBank = true) {
			if (bofa) {
				System.out.println("Get money from bofa! ");
			} else if (wellsFargo) {
				System.out.println("Get money from Wells Fargo! ");
			} else if (chase) {
				System.out.println("Get money from chase! ");
			} else if (frost) {
				System.out.println("Get money from frost! ");
			} else {
				System.out.println("You are broke, go find a job in tech! ");
			}

		}

		boolean hasTravel = true;

		boolean chicago = false;
		boolean atlanta = false;
		boolean madrid = false;
		boolean newYork = false;

		if (hasTravel) {
			if (chicago) {
				System.out.println("You are going to chicago tomorrow! ");
			} else if (atlanta) {
				System.out.println("You are going to altanta tomorrow! ");
			} else if (madrid) {
				System.out.println("You are going to madrid tomorrow! ");
			} else if (newYork) {
				System.out.println("You are going to NY tomorrow! get ready! ");
			} else {
				System.out.println("You do NOT have any trip put your ass down and study JAVA");
			}

		}

	}

}
