package testngBasics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//readSingleValue("Login", 1, 1);
		//readMultipleValue("Register");
	}

	public static String[][] readMultipleValue(String sheetName) throws EncryptedDocumentException, IOException {

		File file = new File("./TestData/TestData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		int row_num = sheet.getPhysicalNumberOfRows();
		//Because first row has the column headers
		int col_num = sheet.getRow(0).getPhysicalNumberOfCells();
		//create a 2-D array of the same size as excel sheet
		String[][] data=new String[row_num][col_num];
		
		for(int i=0;i<row_num;i++) { //to iterate excel rows
			for(int j=0;j<col_num;j++) { //to iterate cells in the row
				data[i][j] = sheet.getRow(i).getCell(j).toString();
				//System.out.print(sheet.getRow(i).getCell(j).toString()+" ");
			}
			//System.out.println();
		}
		return data;
	}

	public static void readSingleValue(String sheetName, int row, int cell)
			throws EncryptedDocumentException, IOException {
		/**
		 * write code to fetch data from excel one value at a time
		 */
		File file = new File("./TestData/TestData.xlsx");
		// if we want to fetch data from external file,
		FileInputStream fis = new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(fis);
		/*
		 * WorkbookFactory class and its method they create the appropriate workbook
		 * HSSF & XSSF workbook
		 */
		Sheet sheet = workbook.getSheet(sheetName);
		System.out.println(sheet.getRow(row).getCell(cell).toString());
	}

}
