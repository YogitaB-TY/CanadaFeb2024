package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningScrollToElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		Actions action=new Actions(driver);
		WebElement marathahalli=driver.findElement(By.xpath("//h5[text()='Marathahalli']"));
		action.scrollToElement(marathahalli).build().perform();
		WebElement hsr=driver.findElement(By.xpath("//h5[text()='HSR']"));
		action.scrollToElement(hsr).build().perform();
	}
}
