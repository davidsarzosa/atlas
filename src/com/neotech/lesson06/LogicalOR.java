package com.neotech.lesson06;

public class LogicalOR {

	public static void main(String[] args) {

		// if a person has any kind of allergy, say you have allergies
		// otherwise say you are healthy

		boolean hasAllergy = true;
		boolean peanutAllergy = false;
		boolean lactoseAllergy = false;
		boolean seafoodAllergy = false;
		boolean beeAllergy = false;

		if (hasAllergy && (peanutAllergy || lactoseAllergy || beeAllergy || seafoodAllergy)) {
			System.out.println("You are allergic to something");
		} else {
			System.out.println("You are not allergic to anything");
		}

		System.out.println("==================================================");

		boolean hasFlue = true;
		boolean covidFlue = false;
		boolean normalFlue = true;
		boolean porcinFlue = false;
		boolean aviarFlue = false;

		if (hasFlue && (covidFlue || normalFlue || porcinFlue || aviarFlue)) {
			System.out.println("You have flue please stay home and get better ");
		} else {
			System.out.println("You dont have flue, go play soccer tonigth! ");
		}

		System.out.println("===================================================");

		boolean hasNoAlcohol = true;

		boolean virginMargarita = false;
		boolean virginMojito = false;
		boolean virginDaiquiri = false;
		boolean beer = false;
		boolean water = false;

		if (hasNoAlcohol && (virginMargarita || virginMojito || virginDaiquiri || water || beer)) {
			System.out.println("This has alcohol you can not drink it! please go take some watter");
		} else {
			System.out.println("You are good you can drink everything from the menu! thanks! ");
		}

	}
}
