package Selenium_Imp_concepts;

import org.testng.annotations.Test;

public class Handling_exceptions {
	@Test(timeOut = 1000, expectedExceptions = ArrayIndexOutOfBoundsException.class)
	public void test() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Priya");
}
}