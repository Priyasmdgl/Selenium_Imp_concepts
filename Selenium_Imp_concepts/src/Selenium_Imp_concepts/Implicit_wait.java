package Selenium_Imp_concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.phptravels.net/login");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("user@phptravels.com");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("demouser");
		
		WebElement login = driver.findElement(By.id("submitBTN"));
		login.click();
		
		WebElement profile = driver.findElement(By.xpath("//*[@id=\"fadein\"]/main/div/div/div/div[2]/ul/li[3]/a"));
		profile.click();
		
		driver.quit();
	}
}
