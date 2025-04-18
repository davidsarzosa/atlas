package com.neotech.lesson24;

public class CreditCardTest {

	public static void main(String[] args) {

		CreditCard card1 = new CreditCard(5000); // balance is required as a parameter/signature
		card1.CalculateInterest();

		CreditCard card2 = new AX(7000); // up-casting
		card2.CalculateInterest();

		CreditCard card3 = new Visa(45000); // up-casting
		card3.CalculateInterest();
		// card3.cashBack(); we CANNOT call this one because we are using CreditCard -->
		// Object

		// If you have to do something with the cashBack(), then you need to
		// make sure that it is accessible when up-casting
		// or that you assing the object to a Visa Object

		Visa card4 = new Visa(60000);

		// what is the purpose of assigning all of these to a CreditCard object ???

		CreditCard[] cards = { card1, card2, card3, card4, new AX(15000) };
		// Can I also include Card4?

		// display all interest rates using enhanced for loop
		for (CreditCard cc : cards) {
			cc.CalculateInterest();

		}

		// Display all interest rates using indexed for loop ?

		for (int i = 0; i < cards.length; i++) {
			CreditCard cc = cards[i];
			cc.CalculateInterest();

		}
		


	}

}
