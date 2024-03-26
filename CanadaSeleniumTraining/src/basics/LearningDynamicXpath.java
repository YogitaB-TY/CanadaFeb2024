package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningDynamicXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		

		System.out.println(driver.findElement(By.xpath("//a[text()='$25 Virtual Gift Card']/"
				+ "ancestor::div[@class='details']//span")).getText());
		
	}

}
