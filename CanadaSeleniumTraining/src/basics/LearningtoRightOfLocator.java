package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class LearningtoRightOfLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/");
		Thread.sleep(10000);
		driver.findElement(By.id("loginBtn")).click();
		WebElement merchantLoginButton = driver.findElement(By.xpath("//button[text()='Merchant Login']"));
		driver.findElement(RelativeLocator.with(By.xpath("//input[@type='email']"))
				.toRightOf(merchantLoginButton)).sendKeys("Email");

	}

}
