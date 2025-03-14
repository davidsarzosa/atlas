package com.neotech.lesson08;

public class IncrementAndDecrement {

	public static void main(String[] args) {

		int x = 5;

		System.out.println(x);

		x = x + 1; // update value of x by 1 to 1

		System.out.println(x);

		x += 1; // we are updating it using the shorthand operator

		System.out.println(x);

		x++; // post - increment --- > add 1 to x

		System.out.println(x);

		x--; // post-decrement --> subtract 1 from x

		System.out.println(x);

		int y = 10;
		System.out.println("==============================================");
		System.out.println(y++ + " " + y); // there are two thing happening here!!!! BINGO!
		// the first action is print Y
		// the second actions is increment it
		System.out.println("==============================================");

		int z = 10;
		int w = z++; // first do the operation and then increment Z

		System.out.println(z);// Prints the incremented value
		System.out.println(w);// prints the value before we increment
		System.out.println("==============================================");

		int d = 50;
		System.out.println(d++ + " here, so this will only incremebt the number but will not print "); // this line is
																										// only
																										// incrementing
		System.out.println(d + " this line here will show the result after operation "); // , this line will be showing
																							// the result after the
																							// operation

		int p = 60;
		int c = p++;
		System.out.println(c + " again this line will just will do the operation " + "BINGO " + p);
		System.out.println(p + " and this will show the value of p and then ");

	}

}
