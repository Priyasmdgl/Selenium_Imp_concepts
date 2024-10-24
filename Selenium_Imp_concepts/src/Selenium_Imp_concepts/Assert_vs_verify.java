package Selenium_Imp_concepts;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_vs_verify {
	//assert
    @Test
	public void asserts() {
		System.out.println("Before Assertion");
		Assert.assertEquals(true, false);
		System.out.println("After Assertion");
    }
    //verify
    @Test
		public void verify_test() {
    	SoftAssert assert1 = new SoftAssert();
			System.out.println("Before Assertion");
			assert1.fail();
			System.out.println("After Assertion");
		}
	}


