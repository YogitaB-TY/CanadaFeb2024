package basics;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class LearningScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		/**
		 * to take screenshot of the entire webpage, we need to give control of the page to 
		 * takesscreenshot ref variable
		 * 
		 */
		TakesScreenshot takesScreenshot=(TakesScreenshot) driver;
		/**
		 * we have to copy the screenshot from temp location to a destination
		 */
		File dest=new File("./Screenshots/screenshot.png");
		File temp= takesScreenshot.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(temp, dest);
	}
}
