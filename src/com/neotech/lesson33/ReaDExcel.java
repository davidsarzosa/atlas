package com.neotech.lesson33;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReaDExcel {

	public static void main(String[] args) throws IOException {

		// lets get the location of our excel file

		String filePath = System.getProperty("user.dir") + "/test_data/Test.xlsx";

		FileInputStream fis = new FileInputStream(filePath);
		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet("TestData");

		// Get the number of rows
		int rows = sheet.getPhysicalNumberOfRows();
		System.out.println("Number of rows " + rows);

		// get the number of columns
		int cols = sheet.getRow(0).getLastCellNum();
		System.out.println("Number of colums " + cols);

		// Release memory by closing the
		book.close();
		fis.close();

	}

}
