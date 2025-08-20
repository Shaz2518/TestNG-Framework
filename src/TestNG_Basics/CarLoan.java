package TestNG_Basics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CarLoan {
	
	@BeforeClass
	public void classMethod()
	{
		System.out.println("**** I am at class level******");
	}
	
	@Test
	public void webLoginCar()
	{
		System.out.println("Web Login Car Loan");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("***** Before Every Method*****");
	}
	
	@Test
	public void mobileLoginCar()
	{
		System.out.println("Mobile Login Car Loan");
	}
	@Test(groups="Smoke")
	public void mobileLogoutCar()
	{
		System.out.println("Mobile Logout Car Loan");
	}
	@Test
	public void mobileImagesCar()
	{
		System.out.println("Mobile Images Car Loan");
	}
	@Test
	public void mobilePriceCar()
	{
		System.out.println("Mobile Price Car Loan");
	}
	@Test
	public void mobileColorCar()
	{
		System.out.println("Mobile Color Car Loan");
	}
	
	@Test
	public void APILoginCar()
	{
		System.out.println("API Login Car Loan");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("****** After Method*****");
	}
	
	@Parameters({"URL" , "APIKey/username"})
	@Test
	public void paraDemo(String url, String key)
	{
		System.out.println("=================" + url);
		System.out.println("=================" + key);
	}

}
