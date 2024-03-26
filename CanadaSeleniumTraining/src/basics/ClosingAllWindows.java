package basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingAllWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String parentWindow= driver.getWindowHandle();
		System.out.println(parentWindow);
		driver.get("file:///C:/Users/User/Downloads/MultipleWindow.html");
		driver.findElement(By.tagName("input")).click();
		Thread.sleep(3000);
		/**windowHandles will hold 4 window handles of child browsers as well as parent
		 * browser
		 */
		System.out.println();
		Set<String> windowHandles = driver.getWindowHandles();
		for(String print: windowHandles) {
			System.out.println(print);
		}
		  System.out.println(); 
		  windowHandles.remove(parentWindow); 
		  for(String handle:windowHandles) { 
			  System.out.println(handle);
			  driver.switchTo().window(handle); 
			  /**this will return the window handle of where the control is 
			   * switched to
			   */
			  Thread.sleep(3000); 
			  driver.close(); 
			}
		 
		/**
		 * driver.closE() will only close the current window
		 * driver.quit() will close all the windows opened by selenium
		 */
		//driver.quit();
	}
}
