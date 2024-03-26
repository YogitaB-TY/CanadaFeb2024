package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearningSelectClassBasics {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("BOOKS")).click();
		WebElement sortByDropDown=driver.findElement(By.id("products-orderby"));
		Select select=new Select(sortByDropDown);
		select.selectByVisibleText("Price: Low to High");
		//selectByIndex() here index starts from 0
		//select.selectByIndex(1);
		select.selectByValue("https://demowebshop.tricentis.com/books?orderby=6");
	}

}
