package com.neotech.lesson32;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Homework3 {

//	Homework 3:
//	    Create a collection of integers in which you can keep duplicates. 
//	    Write a logic to find sum of all integers

	public static void main(String[] args) {

		Set<Integer> lnumber = new HashSet<>();

		lnumber.add(34);
		lnumber.add(23);
		lnumber.add(23);
		lnumber.add(45);
		lnumber.add(07);
		lnumber.add(32);
		lnumber.add(34);

		int sum = 0;

		for (int i : lnumber) {
			sum += i;
		}
		System.out.println("The total is --> " + sum);
	}
}
