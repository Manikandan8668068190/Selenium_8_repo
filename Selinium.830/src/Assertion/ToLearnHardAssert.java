package Assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnHardAssert 
{
	@Test
	public void login() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop","Welcome Page Should not Be Displayed");
		Reporter.log("Welcome page should be displayed",true);
		
		driver.findElement(By.linkText("Log in")).click();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Login","Login page should not be displayed");
		Reporter.log("Login page Should Be Displayed",true);
		
		driver.findElement(By.id("Email")).sendKeys("mani8668@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Testing@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop","Home page is not Displayed");
		Reporter.log("Home page is displayed",true);
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log out")).click();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
