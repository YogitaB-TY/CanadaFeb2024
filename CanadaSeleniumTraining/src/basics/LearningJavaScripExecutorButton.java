package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningJavaScripExecutorButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.oracle.com/in/java/technologies/downloads/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='jdk-8u401-linux-aarch64.rpm']"))
		.click();
		WebElement disabledLink=
		driver.findElement(By.xpath("//a[text()='Download jdk-8u401-linux-aarch64.rpm']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", disabledLink);
		
	}

}
