package com.neotech.lesson26;

public class MarkTest {

	public static void main(String[] args) {

		StudentA sa = new StudentA(10.3, 20.3, 50.4);
		System.out.println(sa.getAverage());
		StudentB sb = new StudentB(45.4, 50.3, 23.1, 35.3);
		System.out.println(sb.getAverage());

		// Marks as = new Marks(); we CanNOT because is an abstract class
		System.out.println();

		// runTime Polymorphisim

		Marks st3 = new StudentA(10.3, 50.3, 12.4);
		System.out.println(st3.getAverage());
		// RunTime Polymorphisim
		Marks st4 = new StudentB(100, 345.6, 346.4, 30);
		System.out.println(st4.getAverage());
		
		

	}

}
