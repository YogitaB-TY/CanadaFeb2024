package testngBasics;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearningDataProviderRegister {
	
		@Test(dataProvider = "sample")
		public void test(String parameter1, String parameter2,
				String parameter3, String parameter4, String parameter5) {
			System.out.print(parameter1+" ");
			System.out.print(parameter2+" ");
			System.out.print(parameter3+" ");
			System.out.print(parameter4+" ");
			System.out.print(parameter5+" ");
			System.out.println();
		}
	@DataProvider(name = "sample")
	public String[][] testData() throws 
	EncryptedDocumentException, IOException {
		
		return ReadMultipleValues.readMultipleValue("Register");
	}

}
