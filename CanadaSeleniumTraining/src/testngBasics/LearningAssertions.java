package testngBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearningAssertions {
	@Test
	public void addToCart() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		
		//to validate URL: This is a minor validation --> Use Softassert
		SoftAssert ast=new SoftAssert();
		//if parameter is true, TC passes if it is false then test case fails
		ast.assertTrue(driver.getTitle().equalsIgnoreCase("demo web shop"));
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("qa_testuser123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Password@1");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		//to validate Login: This is a critical validation --> HardAssert
		/*
		 * Assert.assertEquals(driver.findElement(By.xpath("(//a[@class='account'])[1]")
		 * ).getText() //-- Actual value ,"qa_testuser123@gmail.com");
		 */
		        //--expected value
		driver.findElement(By.partialLinkText("BOOKS")).click();
		driver.findElement(By.xpath("//a[text()='Computing and Internet']/../..//input")).click();
		driver.findElement(By.xpath("//a[text()='shopping cart']")).click();
		driver.quit();
		ast.assertAll();
	}

}
