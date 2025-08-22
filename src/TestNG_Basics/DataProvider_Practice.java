package TestNG_Basics;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Practice {
	
	/* Scenario - There are 3 users with credit history
	 * Capture Username-password for the user
	 * Rows are defining number of users - 1st-Good History 2nd-No History 3rd- Bad History/Fraud
	 * Columns consists of username and password
	 */
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		
		//1st user
		data[0][0] = "firstuser";
		data[0][1] = "firstpassword";
		
		//2nd user
		data[1][0] = "seconduser";
		data[1][1] = "secondpassword";
		
		//3rd user
		data[2][0] = "thirduser";
		data[2][1] = "thirdpassword";
		
		Assert.assertTrue(false);
		
		return data;
	}

	//Retrieve all the data and print
	@Test(dataProvider="getData")
	public void getDetails(String username, String password)
	{
		System.out.println(username + " " + password);
	}
}
