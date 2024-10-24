package Selenium_Imp_concepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Refresh {

	public static void main(String[] args) throws AWTException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://www.google.com");
	      //or
	      driver.navigate().to("http://www.google.co.in");
	      WebElement searchbox = driver.findElement(By.name("q"));
	      searchbox.sendKeys("Dindigul");
	      //using refresh command
	      driver.navigate().refresh();
	      //using get currenturl if we use driver.get command
	      driver.get(driver.getCurrentUrl());
	      //using javascript executor
	      JavascriptExecutor executor = (JavascriptExecutor) driver;
	      executor.executeScript("location.reload()");
	      //using robot class
	      Robot robot = new Robot();
	      robot.keyPress(KeyEvent.VK_F5);
	      robot.keyRelease(KeyEvent.VK_F5);
	      
	}

}
