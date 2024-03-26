package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningFileUploadPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://smallpdf.com/pdf-to-word");
		driver.findElement(By.xpath("//input[@type='file']"))
		.sendKeys("C:\\Users\\User\\Documents\\PRAVEEN NAYAK_RESUME.pdf");
		//entire path of the file to upload
		//C:\Users\User\Documents\PRAVEEN NAYAK_RESUME.pdf

		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Download']")).click();
	}

}
