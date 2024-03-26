package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningiFrames {
	/**
	 * open web page and then click on India in ndtv page and then click on google
	 * in the html webpage
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User/Downloads/iframe.html");
		Thread.sleep(3000);
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("frame1");
		//driver.switchTo().frame("FR1");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='FR1']")));
		driver.findElement(By.xpath("//a[text()='INDIA']")).click();
		Thread.sleep(3000);
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		driver.findElement(By.partialLinkText("Google")).click();
	}

}
