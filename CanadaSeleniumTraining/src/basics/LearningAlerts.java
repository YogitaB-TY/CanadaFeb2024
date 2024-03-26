package basics;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearningAlerts {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		/*
		 * implicit wait must be used right after launching browser in every test case
		 */
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("cusid"))));
		
		driver.findElement(By.name("cusid")).sendKeys("45566");
		driver.findElement(By.name("submit")).click();
		
		wait.until(ExpectedConditions.alertIsPresent());
	
		Alert alert =driver.switchTo().alert();
		
		System.out.println(alert.getText());
		if(alert.getText().equals("Do you really want to delete this Customer?")) {
		System.out.println("PASS");
		}
		alert.accept();
		
		Thread.sleep(3000);
		//alert.accept();
		alert.dismiss();
		Thread.sleep(3000);
		driver.quit();
		/*
		 * SampleInterface si; 
		 * si.samplemethod();
		 */
	}
}
