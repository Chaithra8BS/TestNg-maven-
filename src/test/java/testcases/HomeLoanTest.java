package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeLoanTest {

	
	@Test(enabled=false)
	public void test1()
	{
		System.out.println("Inside Homeloan test1");
	}
	@Test(priority=0)
	public void test2()
	{
		System.out.println("inside Home loan test2");
	}
	@Test(priority=5)
	public void test6()
	{
		System.out.println("inside Home loan test6");
	}

}
