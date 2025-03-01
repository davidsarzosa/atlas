package com.neotech.lesson7;

public class IntroSwitchPractice {
	public static void main(String[] args) {

		int phone = 5;
		String Model;

		if (phone == 1) {
			// System.out.println("Model 1");
			Model = "Samsung";
		} else if (phone == 2) {
			// System.out.println("Model 2");
			Model = "Model 2";
		} else if (phone == 3) {
			// System.out.println("Model 3");
			Model = "Model 3";
		} else if (phone == 4) {
			// System.out.println("Model 4");
			Model = "Model 4";
		} else if (phone == 5) {
			// System.out.println("Model 5");
			Model = "Xiaomi";
		} else if (phone == 6) {
			// System.out.println("Model 6");
			Model = "Model 6";
		} else if (phone == 7) {
			// System.out.println("Model 7");
			Model = "Model 7";
		} else if (phone == 8) {
			// System.out.println("Model 8");
			Model = "Model 8";
		} else {
			// System.out.println("We dont have that model sorry ");
			Model = "We dont have that model sorry ";
		}

		System.out.println("The phone you have now is : " + Model + " We need to fix it! ");

		System.out.println("===============================================================");

		int brand = 5;
		String Model3;
		switch (brand) {
		case 1:
			Model3 = "Samsung";
			break;
		case 2:
			Model3 = "Xiaomi";
			break;
		case 3:
			Model3 = "Apple";
			break;
		case 4:
			Model3 = "OnePlus";
			break;
		case 5:
			Model3 = "XOXO";
			break;
		case 6:
			Model3 = "Azus";
			break;
		case 7:
			Model3 = "Nokia";
			break;
		case 8:
			Model3 = "Huawei";
			break;

		default: // same as the else block
			Model3 = "We dont have that model sorry";

		}

		System.out.println(" Your model is: " + Model3 + " Thank you for your visit ");

		System.out.println("===============================================================");

		int car = 5;
		String Model1;

		switch (car) {
		case 1:
			Model1 = "Toyota";
			break;
		case 2:
			Model1 = "Mazda";
			break;
		case 3:
			Model1 = "Mercedez";
			break;
		case 4:
			Model1 = "Lamborgini";
			break;
		case 5:
			Model1 = "Chervolet";
			break;
		case 6:
			Model1 = "Mitsubishi";
			break;

		default:
			Model1 = "We dont have that model sorry ";

		}
		System.out.println("Your car model is " + Model1 + " Have a very nice day");
		System.out.println("===============================================================");
	}
}
