package com.neotech.lesson33;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelIntro {

	public static void main(String[] args) throws IOException {

		// lets get the location of our excel file

		String filePath = System.getProperty("user.dir") + "/test_data/Test.xlsx";

		// Create a workBook object (the excel file)
		Workbook book = new XSSFWorkbook(filePath);

		// Create a sheet object
		Sheet testData = book.getSheet("TestData");

		// Access certain row within the sheet
		Row firstRow = testData.getRow(0);

		Cell cell = firstRow.getCell(1);

		// lets get the data inside the cell object
		String infoIncell = cell.toString();
		System.out.println(infoIncell);

		// How do I get NY ?

		Row rowNy = testData.getRow(2);
		Cell nyCell = rowNy.getCell(3);
		String cellValue = nyCell.toString();
		System.out.println(cellValue);

		// Lest get Garfield using method chaining

		Cell cellValue2 = testData.getRow(1).getCell(2);
		System.out.println(cellValue2);

		// How do i get a number from value from the cell ?
		double cellDoubleValue = testData.getRow(1).getCell(4).getNumericCellValue();
		System.out.println(cellDoubleValue);

		// we can convert it into a integer
		int intValue = (int) cellDoubleValue;
		System.out.println(intValue);

	}

}
