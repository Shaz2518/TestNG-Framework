package TestNG_Basics;

import org.testng.ITestListener;
import org.testng.ITestResult;
//Use interface ITestListeners
public class Listeners_Practice implements ITestListener{

	
	//This execute when testcases pass
	
		/*@Override
		public void onTestSuccess(ITestResult results)
		{
			System.out.println("Listener execution sucesssful");
		}*/
	
	// This execute when testcases fail
		@Override
		public void onTestFailure(ITestResult result)
		{
			System.out.println("Listener execution failed");
			//To get testcase name
			System.out.println("Method Failing: " + result.getName());
		}
	
}
