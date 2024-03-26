package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

//import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class LearningAboveLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/");
		/*
		 * synchronization
		 */
		Thread.sleep(6000);
		driver.findElement(By.id("loginBtn")).click();
		WebElement passwordTextField=driver.findElement(By.id("Password"));
		
		//driver.findElement(with(By.tagName("input")).above(passwordTextField)).sendKeys("Email");
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(passwordTextField)).sendKeys("Email");
	}

}
