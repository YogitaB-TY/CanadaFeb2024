package basics;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User/Documents/Selenium/HTML-Pages/MultipleDropdown.html");
		WebElement multiSelectDropDown = driver.findElement(By.name("menu"));
		Select select=new Select(multiSelectDropDown);
		List<WebElement> options = select.getOptions();
		for(int i=0;i<options.size();i++) {
			Thread.sleep(1000);
			select.selectByIndex(i);
		}
		//deselect option works only for multiselect dropdown
		select.deselectByVisibleText("Pasta");
	}

}
