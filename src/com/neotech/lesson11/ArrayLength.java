package com.neotech.lesson11;

public class ArrayLength {

	public static void main(String[] args) {

		// create an array of names
		String[] names = new String[5]; // I have difined the size,the values are null by defualt

		names[0] = "Leonardo";
		names[1] = "Mateo";
		names[2] = "Gerardo";
		names[3] = "Armando";
		names[4] = "Amado";

		int arrayLength = names.length;
		System.out.println(arrayLength);

		int[] scores = { 90, 80, 60, 38, 28, 63, 70, 69, 59 };
		System.out.println(scores.length);

		int total = scores.length;
		for (int i = 0; i < total; i++) {
			System.out.print(scores[i] + " ");

		}
		
		
		
		System.out.println("==============================");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}