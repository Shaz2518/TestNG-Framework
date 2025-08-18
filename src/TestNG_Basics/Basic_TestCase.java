package TestNG_Basics;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Basic_TestCase {
	
	@Test
	public void perLoan()
	{
		System.out.println("Personal Loan");
	}
	
	@Test
	public void carLoan()
	{
		System.out.println("Car Loan");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("******I am at the end*******");
	}
}
