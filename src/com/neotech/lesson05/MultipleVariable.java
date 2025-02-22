package com.neotech.lesson05;

public class MultipleVariable {

	public static void main(String[] args) {

		String userType = "";
		int purchaseAmount = 80;

		if (userType.equals("VIP") && purchaseAmount > 100) {
			System.out.println("Discount 20%");
		} else if (userType.equals("VIP") && purchaseAmount < 100) {
			System.out.println("Discount 15%");
		} else if (purchaseAmount > 100) {
			System.out.println("Discount 10%");
		} else {
			System.out.println("You CAN GO FUCKYOURSELF");
		}

	}

}
