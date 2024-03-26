package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassTestCase {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("BOOKS")).click();
		
		WebElement sortByDropDown=driver.findElement(By.id("products-orderby"));
		Select select=new Select(sortByDropDown);
		
		/**
		 * getOptions() returns a list of all the options developed in the dropdown
		 */
		List<WebElement> options = select.getOptions();
		
		for(int i=0; i<options.size();i++) {
			WebElement sortByDropDown1=driver.findElement(By.id("products-orderby"));
			Select select1=new Select(sortByDropDown1);
			select1.selectByIndex(i);
		}

	}

}
