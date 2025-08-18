package TestNG_Basics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewClass_TestNG {
	
	@Test
	public void homeLoan()
	{
		System.out.println("Home Loan");
	}
	
	@BeforeTest
	public void preRequisite()
	{
		System.out.println("Execute before everything");
	}
	
	

}
