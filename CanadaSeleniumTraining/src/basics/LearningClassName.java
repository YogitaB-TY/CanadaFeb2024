package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningClassName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		/*
		 * findElement() --> accepts By and its static methods return type is WebElement
		 * If your locator matches multiple elements then findElement will return only
		 * the first matching element If your locator is wrong then findElement throws
		 * NoSuchElementException ---> Runtime exception and it means the locator used
		 * is not correct the locator used does not match any elements in the webpage
		 * 
		 * WebElement --> Interface which has 17 abstract methods these methods are
		 * nothing but actions to perform on webelement
		 */
		// driver.findElement(By.tagName("a")).click();
		try {
			driver.findElement(By.className("ico-register")).click();
			/*
			 * logging into console
			 */
			System.out.println("PASS: Register page is displayed");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("FAIL: Register page is not displayed");
		}
	}

}
