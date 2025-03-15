package com.neotech.lesson12;

import java.util.Arrays;

public class TwoDimentionalArrayLength {

	public static void main(String[] args) {

		String[][] months = { { "Novemver", "December", "January", "Unknow" }, { "March", "April", "May" },
				{ "June,", "July", "August" }, { "September", "October", "November" } };

		// the number of rows in two domentional array
		int rows = months.length;
		System.out.println("rows --> " + rows);

		// the number of columns in first row
		int lengthOffFirstRow = months[1].length;
		System.out.println("The first row has " + lengthOffFirstRow + " columns");

		// how do I print Uknown ?
		System.out.println(months[0][3]);

		// Compile error because a forth element in row 1 does not exist.
		// System.out.println(months[0][4]);

		months[0][3] = "Update Uknow";
		System.out.println(Arrays.toString(months[0]));

	}
}
