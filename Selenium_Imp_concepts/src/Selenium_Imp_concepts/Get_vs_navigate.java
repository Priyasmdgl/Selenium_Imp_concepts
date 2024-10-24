package Selenium_Imp_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_vs_navigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://www.google.com");
	      //or
	      driver.navigate().to("http://www.google.co.in");
	      WebElement searchbox = driver.findElement(By.name("q"));
	      searchbox.sendKeys("Dindigul"+Keys.ENTER);
	      driver.navigate().back();
	      driver.navigate().forward();
	      driver.navigate().refresh();
	}

}
