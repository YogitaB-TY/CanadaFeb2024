package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningWebElementMethods {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement registerLink= driver.findElement(By.partialLinkText("Register"));
		System.out.println(registerLink.getAttribute("href"));
		WebElement searchTextField=driver.findElement(By.id("small-searchterms"));
		System.out.println(searchTextField.getAttribute("value"));
		System.out.println(registerLink.getText());
		WebElement subscribeButton=driver.findElement(By
				.id("newsletter-subscribe-button"));
		subscribeButton.submit();
		/*
		 * WebElement
		 * searchButton=driver.findElement(By.xpath("//input[@value='Search']"));
		 * searchButton.submit();
		 */
	}
}
