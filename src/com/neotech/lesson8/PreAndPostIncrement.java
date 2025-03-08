package com.neotech.lesson8;

public class PreAndPostIncrement {

	public static void main(String[] args) {

		// main definitions
		// increment vs decrement
		// pre vs post

		// All the possible combinations

		// ++a
		// --a
		// a++
		// a--

		int x;
		int y = 20;

		x = y++; // this is a post increment:

		// 1. Perform the operation --- assing the value of Y to X
		// 2. Apply the increment -- increase the value of Y by 1

		// this is how that line would look in two in two lines of code
		// x = y;
		// y +=1;

		System.out.println(x);
		System.out.println(y);

		int a;
		int b = 10;

		a = ++b; // This is Pre-Increment :
		// b += 1;
		// a =b;
		System.out.println(a);
		System.out.println(b);

		int c;
		int d = 5;

		c = d--; // POST-DECREMENT
		// c = d
		// d -=1;

		System.out.println(c);
		System.out.println(d);

		int e;
		int f = 8;

		e = --f;
		// f -= 1 ---> 7
		// e = f; ---> 7

		System.out.println(e);
		System.out.println(f);

		int num = 10;
		
		System.out.println(num); //10 
		System.out.println(num ++ );// Print 10 and then add 1 
		System.out.println(num); // prints 11 
		
		System.out.println(++num); // this is PRE - INCREMENT will print 12
		
		System.out.println(--num); // This is PRE DECREMENT will print 11 
		System.out.println(num --);// This is POST - DECREMENT will print and then rest 1 
		System.out.println(num); // This will print 10 
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
