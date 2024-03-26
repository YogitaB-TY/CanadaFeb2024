package basics;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningTagName {
	/*
	 * in this TC we are trying to fetch the text of all the links to validate 
	 * whether the correct texts are developed
	 */
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		/*
		 * findElements() is used to identify multiple elements
		 * it returns all the matching webelements in the form of List interface
		 * List: - it is indexed
		 *       - it follows insertion order
		 *       - it allows duplicates
		 *       size() will return the size of the collection
		 * findElements returns an empty list if the locator used does
		 * not match any elements in the webpage
		 */
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++) {
			//String text=links.get(i).getText();
			/*
			 * getText() returns the text of any WebElement in the form of String
			 */
					//System.out.println(text);
			/*
			 * getAttribute(name) returns the attribute value of the attribute name
			 * passed as parameter in the form of string
			 */
			String hrefValues=links.get(i).getAttribute("href");
			System.out.println(hrefValues);
			
		}
	}

}
