package com.neotech.lesson22;

public class Addition {

	// method signature

	void add(int a, int b) {
		System.out.println(a + b);
	}

	// void add (int, int , int ) -- > method overloading changing the method of
	// parameters

	void add(int a, int b, int c) {

		System.out.println(a + b + c);
	}

	// void add (int, int ) // not method overloading because it has same signature
	// as above
//		void add(int c, int d) {
//		System.out.println(c + d);
//	}

	// method overloading because changing the parameters types
	void add(double a, double b) {

		System.out.println(a + b);

	}

	// void add(double a, double b, double c)
	void add(double a, double b, double c) {

		System.out.println(a + b + c);
	}

	// void add(double, int)
	void add(double d, int i) {

		System.out.println(d + i);
	}

	// void add(int, double)
	void add(int i, double d) {
		System.out.println(i + d);
	}

	// void add(String, int)
	void add(String str, int a) {
		System.out.println(a + " " + str);
	}

	// void add(int, String)
	void add(int a, String str) {
		System.out.println(a + " " + str);
	}

}
