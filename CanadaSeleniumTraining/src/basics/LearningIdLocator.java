package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningIdLocator {

	public static void main(String[] args) {
		String text="SampleString";
		char[] characterArray= text.toCharArray();
		System.out.println(characterArray[3]);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.id("gender-female")).click();
		WebElement firstName=driver.findElement(By.id("FirstName"));
		// enter firstName 
		//sendKeys() is a method used to enter values into a text field.
		firstName.sendKeys("Automation");
		driver.findElement(By.id("LastName")).sendKeys("Engineer");
		driver.findElement(By.name("Email")).sendKeys("automationengineer@testmail.com");
	}
}
