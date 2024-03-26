package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningRightClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightClickButton=driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions action=new Actions(driver);
		
		action.contextClick(rightClickButton).build().perform();
		
		 //contextClick() : Right Click 
		action.moveToElement(rightClickButton).contextClick().build().perform();
	}

}
