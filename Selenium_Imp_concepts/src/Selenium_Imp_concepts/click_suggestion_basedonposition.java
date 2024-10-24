package Selenium_Imp_concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class click_suggestion_basedonposition {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://www.google.com");
	      
	      WebElement searchbox = driver.findElement(By.name("q"));
	      searchbox.sendKeys("Dindigul");
	      Thread.sleep(1000);
	      //printing all the suggestions given by google when we search for dindigul
	      List<WebElement> search = driver.findElements(By.xpath("//ul[@role='listbox']//following::li"));
	      int position=0;
	      for (WebElement webElement : search) {
			System.out.println(webElement.getText());
			position++;
			
			if(position==2) {
				webElement.click();
				break;
			}
	}

	}
}
