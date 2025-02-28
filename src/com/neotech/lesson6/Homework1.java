package com.neotech.lesson6;

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
	}

}

//	public static void main(String[] args) {
//
//		boolean HasAllergie = false;
//		String allergies = ("lactoes, honey, peanut, seafood,");
//		String allergiesPatien1 = ("lactoes, honey, peanut, seafood, coconout, gluten");
//
//		if (HasAllergie)
//
//			if (HasAllergie && allergies == allergiesPatien1) {
//
//				System.out.println("Don't eat chese, milk, butter, honey, no peanut, no seafood");
//			} else {
//				System.out.println("Dont eat any lactoes, honey, peanut, seafood,");
//			}
//		System.out.println("You dont have any allergie you re good to go ");
//	}
