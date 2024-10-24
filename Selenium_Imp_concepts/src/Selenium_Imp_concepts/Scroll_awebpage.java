package Selenium_Imp_concepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_awebpage {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/dashboard.xhtml");
		//scroll down
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scroll(0,500)", "");
		Thread.sleep(1000);
		//scroll down
		executor.executeScript("window.scroll(0,-500)","");
	    //scroll to bottom of the page
		executor.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		Thread.sleep(1000);
		//scroll to top of the page
		executor.executeScript("window.scrollTo(0,0)","");
		//scroll to the position where an element is present
		WebElement element = driver.findElement(By.xpath("//*[@id=\"j_idt154_content\"]/table/tbody/tr[6]/td[1]/span"));
		executor.executeScript("arguments[0].scrollIntoView(true);",element);
		//using robot class
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
		

	}

}
