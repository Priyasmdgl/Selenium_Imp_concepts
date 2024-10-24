package Selenium_Imp_concepts;

import org.testng.annotations.Test;

public class Timeout_Exception {
	@Test(timeOut = 1000)
	public void test() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Priya");
	}
}
