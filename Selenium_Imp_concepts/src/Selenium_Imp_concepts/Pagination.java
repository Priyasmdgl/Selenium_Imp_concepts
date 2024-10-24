package Selenium_Imp_concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://getdataden.com/docs/grid/features/pagination/");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      //finding the size of pagination to confirm that it is >0
	     int size = driver.findElements(By.xpath("//div[@class='data-den-pagination']//button")).size();
         System.out.println(size);
         if(size>0) {
        	 System.out.println("Pagination is there");
         }else {
        	 System.out.println("No pagination");
         }
         //clicking next button and once it get disabled it will stop
         do {
        	 WebElement next = driver.findElement(By.className("data-den-pagination-button"));
             String classname = next.getAttribute("class");
             if(!classname.contains("disabled")) {
            	 next.click();
         }else {
        	 break;
         }
         }
         while(true);
	}
}
