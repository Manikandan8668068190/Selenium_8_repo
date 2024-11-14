package Assignment;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class Assignment51 
{
	public static void main(String[] args) 
	{	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("http://automationexercise.com");
	Assert.assertEquals(driver.getTitle(), "Automation Exercise","Home page is Not Visble");
	Reporter.log("Home page is visible Succesfully",true);
	
	driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
	Assert.assertTrue(driver.findElement(By.tagName("h2")).isDisplayed(),"Login to Your Account Is Not Visible");
	Reporter.log("Login to your account is displayed",true);
	
	driver.findElement(By.name("email")).sendKeys("mani8668@gmail.com");
	driver.findElement(By.name("password")).sendKeys("Testing@123"); 
	driver.findElement(By.xpath("//button[text()='Login']")).click();
	Assert.assertTrue(driver.findElement(By.xpath("//a[text()=' Logout']")).isDisplayed(),"'Logged in as username' is not visible");
	Reporter.log("'Logged in as username' is visible",true);
	
	driver.findElement(By.xpath("//a[contains(text(),'Delete Account')]")).click();
	Assert.assertTrue(driver.findElement(By.tagName("b")).isDisplayed(),"Account Deleted is not succesfully");
	Reporter.log("Account Deleted succesfully",true);
	
	
	}
}
