package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnClear 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement UserName = driver.findElement(By.id("username"));
		Thread.sleep(2000);
		UserName.clear();
		Thread.sleep(2000);
		UserName.sendKeys("Testing");
		WebElement password = driver.findElement(By.id("password"));
		Thread.sleep(2000);
		password.clear();
		Thread.sleep(2000);
		password.sendKeys("1234567890");
	}

}
