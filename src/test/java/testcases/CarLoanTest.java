package testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//inheriting the Base Class for before and after methods and tests.
public class CarLoanTest extends BaseClass{
//	@BeforeMethod
//	public void method1()
//	{
//		System.out.println("Inside Before method");
//	}
	@Test(dependsOnMethods="test7")
	public void test3()
	{
		System.out.println("Inside CarLoan test3");
	}
	@Test(groups= {"sanity","regression"})
	public void test7()
	{
		System.out.println("Inside CarLoan test7");
	}

}
