package TestNG_Basics;

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
}
