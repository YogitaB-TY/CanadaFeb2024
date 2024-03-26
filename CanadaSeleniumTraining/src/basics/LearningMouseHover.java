package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningMouseHover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		WebElement computersHeaderLink=driver.findElement(By.linkText("COMPUTERS"));
		Actions action=new Actions(driver);
		action.moveToElement(computersHeaderLink).build().perform();
		Thread.sleep(2000);
		/**
		 * composite action:
		 * performing one action on top of another action
		 */
		action.moveToElement(driver.findElement(By.linkText("Desktops"))).click().build().perform();
		

	}

}
