package TestNg;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript extends BaseClass 
{
	@Test
	public void clickOnBooks()
	{
		driver.findElement(By.partialLinkText("BOOKS")).click();
		
		if(driver.getTitle().equals(""))
		{
			Reporter.log("Books Page Is Displayed",true);
		}
		else
		{
			Reporter.log("Books Page Is Not Displayed",true);
		}
	}

}
