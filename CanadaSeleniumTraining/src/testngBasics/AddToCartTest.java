package testngBasics;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddToCartTest {
	
	@Test
	public void addToCart() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("qa_testuser123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Password@1");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.partialLinkText("BOOKS")).click();
		driver.findElement(By.xpath("//a[text()='Computing and Internet']/../..//input")).click();
		driver.findElement(By.xpath("//a[text()='shopping cart']")).click();
		driver.quit();
	}

}
