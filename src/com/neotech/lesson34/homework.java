package com.neotech.lesson34;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Row;

public class homework {

	public static void main(String[] args) throws IOException {

		/*
		 * // Read Companies sheet
		 * 
		 * // 1. Read the third row (row index 2) and create an ArrayList of String. //
		 * Then print the ArrayList.
		 * 
		 * // 2. Read the fifth column (col index 4) and create an HashSet of Double. //
		 * Then print the HashSet.
		 * 
		 */

		// Creating a connection with the browser

		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);

		String filePath = projectPath + "/configs/Homework.xlsx";
		System.out.println(filePath);

		FileInputStream fis = new FileInputStream(filePath);
		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet("Companies");

		Row row = sheet.getRow(2);
		ArrayList<String> rowData = new ArrayList<>();

		if (row != null) {
			row.forEach(cell -> rowData.add(cell.toString()));
		}

		System.out.println("Row Values " + rowData);

		// Always close resources
		book.close();
		fis.close();

	}

}
