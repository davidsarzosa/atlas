package com.neotech.lesson12;

public class task3 {
	public static void main(String[] args) {

//		Create an array of countries.
//		While retrieving all values from an array print capital for each country.
//				(use 2 different loops).

//		String countries[] = { "Brasil", "Peru", "Colombia", "Ecuador", "Venezuela", "Argentina", "Mexico", "Panama",
//				"Honduras", "El Salvador", "Chile", "Bolivia", "Costa Rica", "Guatemala" };
//
//		// System.out.println(countries.length);
//		for (int i = 0; i < countries.length; i++) {
//			if (countries[i].equals("Brasil")) {
//				System.out.println(countries[i] + " - Rio de Janeiro");
//			} else if (countries[i].equals("Peru")) {
//				System.out.println(countries[i] + " - Lima");
//			} else if (countries[i].equals("Colombia")) {
//				System.out.println(countries[i] + " - Bogota");
//			} else if (countries[i].equals("Ecuador")) {
//				System.out.println(countries[i] + " - Quito");
//			} else if (countries[i].equals("Venezuela")) {
//				System.out.println(countries[i] + " - Caracas");
//			} else if (countries[i].equals("Argentina")) {
//				System.out.println(countries[i] + " - Buenos Aires");
//			} else if (countries[i].equals("Mexico")) {
//				System.out.println(countries[i] + " - Mexico DF");
//			} else if (countries[i].equals("Panama")) {
//				System.out.println(countries[i] + " - Ciudad de Panama");
//			} else if (countries[i].equals("Honduras")) {
//				System.out.println(countries[i] + " - Tegucigalpa");
//			} else if (countries[i].equals("El Salvador")) {
//				System.out.println(countries[i] + " - San Salvador");
//			} else if (countries[i].equals("Chile")) {
//				System.out.println(countries[i] + " - Santiago");
//			} else if (countries[i].equals("Bolivia")) {
//				System.out.println(countries[i] + " - La Paz");
//			} else if (countries[i].equals("Costa Rica")) {
//				System.out.println(countries[i] + " - San Jose");
//			} else if (countries[i].equals("Guatemala")) {
//				System.out.println(countries[i] + " - Ciudad de Guatemala");
//			} else {
//				System.out.println(" We do not know ");
//			}
//		}
//
//		System.out.println("/////////////////////////////////////////");
//
//		// enhanced for loop
//
//		for (String country : countries) {
//			if (country.equals("Brasil")) {
//				System.out.println(country + " - Rio de Janeiro");
//			} else if (country.equals("Peru")) {
//				System.out.println(country + " - Lima");
//			} else if (country.equals("Colombia")) {
//				System.out.println(country + " - Bogota");
//			} else if (country.equals("Ecuador")) {
//				System.out.println(country + " - Quito");
//			} else if (country.equals("Venezuela")) {
//				System.out.println(country + " - Caracas");
//			} else if (country.equals("Argentina")) {
//				System.out.println(country + " - Buenos Aires");
//			} else if (country.equals("Mexico")) {
//				System.out.println(country + " - Ciudad de Mexico");
//			} else if (country.equals("Panama")) {
//				System.out.println(country + " - Ciudad de Pnaama");
//			} else if (country.equals("Honduras")) {
//				System.out.println(country + " - Tegucigalpa");
//			} else if (country.equals("El Salvador")) {
//				System.out.println(country + " - San Salvador");
//			} else if (country.equals("Chile")) {
//				System.out.println(country + " - Santiago");
//			} else if (country.equals("Bolivia")) {
//				System.out.println(country + " - La Paz");
//			} else if (country.equals("Costa Rica")) {
//				System.out.println(country + " - San Jose");
//			} else if (country.equals("Guatemala")) {
//				System.out.println(country + " - Ciudad de Guatemala");
//			} else {
//				System.out.println(" - We do not know");
//			}
//		}

//		Create an array of countries.
//		While retrieving all values from an array print capital for each country.
//				(use 2 different loops).

		String[] countries2 = { "Germany", "Poland", "France", "Italy", "Portugal", "Ukraine", };
		for (int i = 0; i < countries2.length; i++) {
			if (countries2[i].equals("Germany")) {
				System.out.println(countries2[i] + " - Berlin");
			} else if (countries2[i].equals("Poland")) {
				System.out.println(countries2[i] + " - Warsaw");
			} else if (countries2[i].equals("France")) {
				System.out.println(countries2[i] + " - Paris");
			} else if (countries2[i].equals("Italy")) {
				System.out.println(countries2[i] + " - Milan");
			} else if (countries2[i].equals("Portugal")) {
				System.out.println(countries2[i] + " - Lisboa");
			} else if (countries2[i].equals("Ukraine")) {
				System.out.println(countries2[i] + " - Kiev");
			} else {
				System.out.println("Invalid Input");
			}
		}

	}
}
