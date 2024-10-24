package Selenium_Imp_concepts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch_browser_using_javascriptexecutor {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      String url = "https://www.google.com";
	      JavascriptExecutor executor = (JavascriptExecutor) driver;
	      executor.executeScript("window.location = \'"+url+"\'");

	}

}
