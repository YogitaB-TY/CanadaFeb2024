package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearningNotificationsPopUp {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("disable-notifications");
		options.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(options);
		//driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
	}

}
