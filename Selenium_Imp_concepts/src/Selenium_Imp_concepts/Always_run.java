package Selenium_Imp_concepts;

import org.testng.annotations.Test;

public class Always_run {
	@Test(timeOut = 1000)
	public void test1() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("1st test");
}
	@Test(dependsOnMethods = "test1",alwaysRun = true)
	public void test2() {
		System.out.println("2nd test");
	}
}