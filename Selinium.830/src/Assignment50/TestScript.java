package Assignment50;


import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript extends BaseClass
{
	@Test
	public void ClickOnSales()
	{
		driver.findElement(By.xpath("//span[text()='Sales']")).click();
		if(driver.getTitle().equals("https://demoapp.skillrary.com/admin/sales.php"))
		{
			Reporter.log("sales page is displayed",true);
		}
		else
		{
			Reporter.log("sales page should not displayed",true);
		}
	
	}
}