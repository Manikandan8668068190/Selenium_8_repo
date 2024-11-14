package Assignment;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import DataProvider.DataStorage;

public class Assignment52 
{
	@DataProvider
	public String[][] registerdata()
	{
		String[][] data= {{"mani","kandan","mani123@gmail.com","12345678","12345678"},
						  {"devendra","reddy","reddy123@gmail.com","67891011","67891011"},
						  {"hemanth","goud","Hemanth123@gmail.com","10111213","10111213"}};
		return data;
	}
	@Test (dataProvider = "registerdata")
	public void register(String[] cred)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(cred[0]);
		driver.findElement(By.id("LastName")).sendKeys(cred[1]);
		driver.findElement(By.id("Email")).sendKeys(cred[2]);
		driver.findElement(By.id("Password")).sendKeys(cred[3]);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(cred[4]);
		
		
		
				
	}

}
