package basics;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningChildWindow {
	/**
	 * close only the Olive garden site Browser window
	 * @param args
	 * @throws InterruptedException 
	 */

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String windowHandle=driver.getWindowHandle();
		System.out.println(windowHandle);
		driver.get("file:///C:/Users/User/Downloads/MultipleWindow.html");
		driver.findElement(By.tagName("input")).click();
		Thread.sleep(3000);
		Set<String> windowHandles = driver.getWindowHandles();
		for(String handle:windowHandles) {
			System.out.println(handle);
			driver.switchTo().window(handle);		
			if(driver.getCurrentUrl().contains("olive")) {
				driver.close();
			}
		}
		//i have to pass windowHandle
		//driver.switchTo().window(null);
	}

}
