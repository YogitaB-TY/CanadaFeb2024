package testngBasics;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearningDataProvider {
	
	//test case --> data should move from test data to test case
	//data driven testing
		@Test(dataProvider = "sample")
		public void test(String parameter1, String parameter2) {
			System.out.println(parameter1);
			System.out.println(parameter2);
		}
	
	//this is test data
	@DataProvider(name = "sample")
	public String[][] testData() throws EncryptedDocumentException, IOException {
		/*
		 * String[][] data=new String[2][2]; 
		 * data[0][0]="username1";
		 * data[0][1]="password1"; 
		 * data[1][0]="username2"; 
		 * data[1][1]="password2";
		 * //return 'data' array from data provider annotation 
		 * return data;
		 */
		
		return ReadMultipleValues.readMultipleValue("Login");
	}

}
