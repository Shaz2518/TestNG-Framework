package TestNG_Basics;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HomeLoan {

	
	@Test(groups="Smoke")
	public void webLoginHome()
	{
		System.out.println("Web Login Home Loan");
	}
	
	@AfterTest
	public void endTest()
	{
		System.out.println("Execute me at the end");
	}
	
	@Test(enabled = false)
	public void mobileLoginHome()
	{
		System.out.println("Mobile Login Home Loan");
	}
	
	@Test(dependsOnMethods = {"webLoginHome"})
	public void APILoginHome()
	{
		System.out.println("API Login Home Loan");
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("********I am the beginning******");
	}
	
	

}
