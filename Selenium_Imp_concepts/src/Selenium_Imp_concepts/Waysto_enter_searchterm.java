package Selenium_Imp_concepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waysto_enter_searchterm {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://www.google.com");
	      //using enter key
	      WebElement searchbox = driver.findElement(By.name("q"));
	      searchbox.sendKeys("Dindigul"+Keys.ENTER);
	      //using submit
          searchbox.sendKeys("Dindigul");
          searchbox.submit();
          //using robot class
          Robot robot = new Robot();
          robot.keyPress(KeyEvent.VK_ENTER);
          robot.keyRelease(KeyEvent.VK_ENTER);
          //using \n
          searchbox.sendKeys("Dindigul \n");
	}

}
