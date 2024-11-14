package Assignment;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assignment47 
{
	@Test
	public void createAccount()
	{
		Reporter.log("Account Create Successfully", true);
	}
	@Test(dependsOnMethods = "createAccount",priority = 1)
	public void editAccount()
	{
		Reporter.log("Account Edited", true);
	}
	@Test(invocationCount = 2,threadPoolSize = 2,dependsOnMethods = {"createAccount","editAccount"})
	public void deleteAccount()
	{
		Reporter.log("Account Deleted Sussfully", true);		
	}
}
