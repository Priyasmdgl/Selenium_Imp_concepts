package Selenium_Imp_concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication_popup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
