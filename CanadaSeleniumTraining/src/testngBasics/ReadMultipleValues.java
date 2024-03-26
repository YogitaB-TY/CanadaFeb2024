package testngBasics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleValues {
	
	public static String[][] readMultipleValue(String sheetName) throws EncryptedDocumentException, IOException {
		File file = new File("./TestData/TestData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		int row_num = sheet.getPhysicalNumberOfRows(); //3
		int col_num = sheet.getRow(0).getPhysicalNumberOfCells();
		String[][] data=new String[row_num-1][col_num];
		for(int i=0;i<row_num-1;i++) { 
			for(int j=0;j<col_num;j++) { 
				data[i][j] = sheet.getRow(i+1).getCell(j).toString();
			}
			
		}
		return data;
	}
}
