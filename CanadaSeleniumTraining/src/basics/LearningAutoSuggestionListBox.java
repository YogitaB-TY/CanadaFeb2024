package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningAutoSuggestionListBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		//Thread.sleep(2000);
		driver.findElement(By.className("desktop-searchBar")).sendKeys("puma");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='Puma Duffel']")).click();

	}

}
