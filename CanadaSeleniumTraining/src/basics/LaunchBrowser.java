package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public static void main(String[] args) {
		/*
		 * to set up chrome driver, we use a Java class called System
		 * we have a method called setProperty
		 * key- specifies which browser to use
		 *  syntax: webdriver.browsername.driver
		 * value-specifies path of the driver
		 * ./ --> the control of jvm has to move to inside the current project
		 */
		//System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		//to launch browser
		ChromeDriver driver=new ChromeDriver();
		
		/*
		 * get() :
		 *  - It accepts url only is it has http or https
		 *  - it waits until the entire web page is loaded
		 *  - we can use multiple get() one after the other
		 */
		driver.get("https://demowebshop.tricentis.com/");
		driver.get("https://www.selenium.dev/");
		//access code: scjb
		driver.close();
		/*
		 * close() closes the browser that is opened by selenium
		 */
	}
}
