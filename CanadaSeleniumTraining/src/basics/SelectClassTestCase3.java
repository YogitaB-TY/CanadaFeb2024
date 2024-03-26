package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassTestCase3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/books");
		WebElement dropDown=driver.findElement(By.id("products-orderby"));
		Select select=new Select(dropDown);
		List<WebElement> options = select.getOptions();
		for(int i=0;i<options.size();i++) {
			if(options.get(i).getText().equals("Price: Low to High")) {
				System.out.println(i+" is the index of Price: Low to High");
			}
		}
	}

}
