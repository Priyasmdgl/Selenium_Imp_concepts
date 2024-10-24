package Selenium_Imp_concepts;

import org.testng.annotations.Test;

public class Execute_testcase_multipletimes {
    @Test(invocationCount = 5)
	public void test() {
		System.out.println("Priya");
	}
}
