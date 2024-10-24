package Selenium_Imp_concepts;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


import com.google.common.base.Function;

public class Fluent_wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/login");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("user@phptravels.com");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("demouser");
		
		WebElement login = driver.findElement(By.id("submitBTN"));
		login.click();
		//Fluent wait
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).ignoring(org.openqa.selenium.NoSuchElementException.class);
		WebElement profile = wait.until(new Function<WebDriver, WebElement>() {

			//apply method
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//*[@id=\"fadein\"]/main/div/div/div/div[2]/ul/li[3]/a"));
			}
		});
		profile.click();
		driver.quit();
	}

}
