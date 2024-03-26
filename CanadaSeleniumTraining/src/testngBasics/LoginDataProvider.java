package testngBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginDataProvider {	
	@Test(dataProvider = "testData")
	public void loginTest(String userName, String passsword) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(userName);
		driver.findElement(By.id("Password")).sendKeys(passsword);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(4000);
		if(driver.findElement(By.xpath("(//a[@class='account'])[1]")).getText().equals(userName)) {
			System.out.println("User is successfully logged in");
		}
		driver.quit();
	}	
	@DataProvider(name = "testData")
	public String[][] testData() {
		String[][] data=new String[2][2];
		data[0][0]="yogbelavanaki@gmail.com";
		data[0][1]="Password@123";
		data[1][0]="helloQATest@gmail.com";
		data[1][1]="Password@123";
		return data;
	}
}
