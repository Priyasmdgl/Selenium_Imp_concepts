package Selenium_Imp_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Underlined {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement tamil = driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a[5]"));
		String before_hovering = tamil.getCssValue("text-decoration");
        System.out.println(before_hovering);
        //hovering an element using actions class
        Actions actions = new Actions(driver);
        actions.moveToElement(tamil);
        actions.build().perform();
        //checking whether the element is underlined or not
        String after_hovering = tamil.getCssValue("text-decoration");
        System.out.println(after_hovering);
	}

}
