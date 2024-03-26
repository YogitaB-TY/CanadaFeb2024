package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentFindElements {
	
	

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> images = driver.findElements(By.tagName("img"));
		for(int i=0;i<images.size();i++) {
			String altValues=images.get(i).getAttribute("alt");
			System.out.println(altValues);
		}

	}

}
