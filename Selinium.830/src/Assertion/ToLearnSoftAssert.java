package Assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ToLearnSoftAssert 
{
	@Test
	public void login() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(driver.getTitle(),"Demo Web Shop","Welcome page is not displayed");
		Reporter.log("Welcome page should be displayed",true);
				
		driver.findElement(By.linkText("Log in")).click();
		soft.assertEquals(driver.getTitle(),"Demo Web Shop. Login","login page should not be displayed");
		Reporter.log("Login page should be displayed",true);
		
		driver.findElement(By.id("Email")).sendKeys("mani8668@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Testing@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		soft.assertEquals(driver.getTitle(),"Demo Web Shop","Home page should not displayed");
		Reporter.log("Home Page Should Be Displayed",true);
	
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log out")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
