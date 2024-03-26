package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class LearningToLeftOf {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/");
		Thread.sleep(6000);
		driver.findElement(By.id("loginBtn")).click();
		WebElement emailTextField = driver.findElement(By.id("Email"));
		driver.findElement(RelativeLocator.with(By.xpath("//button[contains(text(),'Merchant')]"))
				.toLeftOf(emailTextField)).click();
	}

}
