package Selenium_Imp_concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_searchresults_url {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://www.google.com");
	      
	      WebElement searchbox = driver.findElement(By.name("q"));
	      searchbox.sendKeys("Dindigul"+Keys.ENTER);
	      Thread.sleep(500);
	      //get all the links under the page which we have searched above
	     List<WebElement> links = driver.findElements(By.xpath("//a"));
	      for (WebElement webElement : links) {
		  System.out.println(webElement.getAttribute("href"));
			//print only main links
			List<WebElement> mainlinks = driver.findElements(By.xpath("//*[@id='kp-wp-tab-overview']//following::h2//following::div/cite"));
	      for (WebElement webElement2 : mainlinks) {
			System.out.println(webElement2.getText());
		}
	      }
	}
}


