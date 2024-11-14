package TestNg;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass 
{
	public WebDriver driver;
	public Properties prop;
	
	
	@BeforeTest
	public void objectCreation() throws IOException
	{
		//Property file
		FileInputStream pFis=new FileInputStream(".testdata/CommandData.properties");
		prop=new Properties();
		prop.load(pFis);
		
		//Excel
		FileInputStream eFis=new FileInputStream("testdata/testscriptdata1.xlsx");
	}
	
	@BeforeClass
	public void launchBrowser()
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		String URL = prop.getProperty("url");
		driver.get(URL);
	}
	@BeforeMethod
	public void login()
	{
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("mani8668@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Testing@123");
//		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	@AfterMethod
	public void logout()
	{
		driver.findElement(By.linkText("Log out")).click();
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
	
	
}
