package basics;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningWebDriverMethods{

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		/*
		 * Upcasting: Converting the sub class object to superclass type
		 * - Generalization
		 */
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		/*
		 * manage() --> Return type is options
		 * Using manage() we can manage three things: Window, cookies and timeouts
		 * 
		 */
		driver.manage().window().maximize();
		Thread.sleep(2000);
		/*
		 * driver.manage().window().minimize(); Thread.sleep(2000);
		 * driver.manage().window().fullscreen(); Thread.sleep(2000);
		 */  
		/*
		 * navigate() --> navigate() is used to perform browser navigation
		 */
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		/*
		 * navigate().to() : this to() is overloaded
		 * to() internally invokes get()
		 * to() is another way to navigate to a URL
		 */
		driver.navigate().to("https://www.selenium.dev/");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		URL url=new URL("https://github.com/");
		driver.navigate().to(url);
		Thread.sleep(2000);
		String title=driver.getTitle();
		String currentUrl=driver.getCurrentUrl();
		System.out.println(title);
		System.out.println(currentUrl);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println(driver.getPageSource());
		//driver.close();
	}

}
