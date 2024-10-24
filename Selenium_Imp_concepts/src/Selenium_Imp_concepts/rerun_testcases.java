package Selenium_Imp_concepts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class rerun_testcases {
	@Test
	//@Test(retryAnalyzer = Retry.class)
	public void test1() {
		Assert.assertEquals(true, false);
	}
	@Test
	public void test2() {
		Assert.assertEquals(true, false);
	}

}
