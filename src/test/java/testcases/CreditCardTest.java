package testcases;

import org.testng.annotations.Test;

public class CreditCardTest extends BaseClass{
	@Test(groups= {"sanity"})
	public void test4()
	{
		System.out.println("Inside Creditcard test4");
	}
	@Test(priority=0)
	public void test5()
	{
		System.out.println("Inside Creditcard test5");
	}


}
