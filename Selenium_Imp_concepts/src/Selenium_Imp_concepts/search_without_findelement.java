package Selenium_Imp_concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
//using page factory method
public class search_without_findelement {
public static WebElement q;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com");
        //using active element
        driver.switchTo().activeElement().sendKeys("Dindigul \n");
        //using page factory
        PageFactory.initElements(driver, search_without_findelement.class);
        q.sendKeys("Dindigul \n");
	}

}
