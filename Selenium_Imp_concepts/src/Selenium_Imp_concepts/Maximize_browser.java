package Selenium_Imp_concepts;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Maximize_browser {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 //using chrome options
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--start-maximized");
	      WebDriver driver = new ChromeDriver(options);
	      driver.navigate().to("http://www.google.co.in");
	      //using maximize
         driver.manage().window().maximize();
          //using dimensions
         Dimension dimension = new Dimension(1440,900);
         driver.manage().window().setSize(dimension);
	}

}
