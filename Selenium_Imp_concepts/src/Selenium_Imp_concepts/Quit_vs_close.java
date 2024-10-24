package Selenium_Imp_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quit_vs_close {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.leafground.com/window.xhtml");
      
      WebElement box = driver.findElement(By.xpath("//*[@id=\"j_idt88:new\"]/span"));
      box.click();
      //close-closes the current window which is focused by the driver which we had defined here
      driver.close();
      //quit-closes all the windows opened by the driver
      driver.quit();
	}

}
