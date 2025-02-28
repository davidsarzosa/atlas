package com.neotech.lesson04;

public class PrimitiveCasting {
	
	public static void main(String[] args) {
		
		
		// Casting or converting 
		// byte -- short -- int -- long -- float -- double 
		
		
		double d1 = 3.7; // no casting/conversion
		System.out.println(d1);
		
		double d2 = 6; // casting is happening 
		System.out.println(d2);
		
		// widening, implicit casting, automatically 
		
		int num1 = 5; 
		System.out.println(num1); // here is not happening 
		double d3 = num1; // here casting is happening 
		System.out.println(d3);
		
		
		// compiler is complaining 
		// Type mismatch : cannot convert from double to int
		// int num2 = 6.3;
		
		// narrowign, explicit casting, manually 
		
		int num2 = (int) 6.8; // I tell Java, I want to store it as an int 
		System.out.println(num2);
		
		
		// narrowing, explicit casting, should be done manually 
		byte b1 = (byte) 4253; // I tell Java, I take the responsability 
		System.out.println(b1);
		
		
		System.out.println("------------------------------");
		
		int i2 = 567; 
		System.out.println(i2);
		byte b2 = (byte) i2; // i may or may not lose data 
		
		System.out.println(b2); // I did NOT lose data 
		
		// narrowing 
		
		long l1 = 17; 
		int number1 = (int) l1; // I did NOT lose data
		System.out.println(number1); // I DID lose data 
		
		// narrowing 
		// We are trying to fit someting big into a small container 
		
		long l2 = 87459687456456L;
		int number2 = (int) l2;
		System.out.println("------------------------------");
		System.out.println(l2); // this is printin the original value
		System.out.println(number2); // I DID lose data // this is printing the value after
		
		// Widening, implicit casting, automatically 
		
		int number5 = 247; 
		
		
		float f1 = (float) number5; // I can specift it, but I don't need
		float f2 = number5; // Even if I dn't specify, it will cast/covert
		System.out.println(f1);
		System.out.println(f2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
