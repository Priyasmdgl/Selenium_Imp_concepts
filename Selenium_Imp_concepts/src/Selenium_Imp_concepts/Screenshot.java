package Selenium_Imp_concepts;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alerts");
		
		WebElement alertbox=driver.findElement(By.id("alertButton"));
		alertbox.click();
		org.openqa.selenium.Alert button = driver.switchTo().alert();
		button.accept();
		//screenshot
				TakesScreenshot screenshot = (TakesScreenshot) driver;
				File sourcefile= screenshot.getScreenshotAs(OutputType.FILE);
				File destinationfile = new File("C:\\Users\\HP\\Downloads\\image.png");
				org.openqa.selenium.io.FileHandler.copy(sourcefile, destinationfile);
		driver.quit();

	}

}
