package Selenium_Imp_concepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Without_sendkeys {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://www.google.com");
	      WebElement searchbox = driver.findElement(By.name("q"));
	     //using javascript executor
	      JavascriptExecutor executor = (JavascriptExecutor) driver;
	      executor.executeScript("document.getElementsByName('q')[0].value='Dindigul'","");
	      //or
	      executor.executeScript("arguments[0].value='Dindigul'", searchbox);
          //using active element and robot class
	      driver.switchTo().activeElement();
	      Robot robot = new Robot();
	      robot.keyPress(KeyEvent.VK_D);
	      robot.keyRelease(KeyEvent.VK_D);
	      robot.keyPress(KeyEvent.VK_O);
	      robot.keyRelease(KeyEvent.VK_O);
	      robot.keyPress(KeyEvent.VK_G);
	      robot.keyRelease(KeyEvent.VK_G);
	}

}
