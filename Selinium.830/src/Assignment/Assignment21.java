package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment21 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement username = driver.findElement(By.name("username"));
		username.clear();
		username.sendKeys("Testing");
		WebElement password = driver.findElement(By.name("password"));
		password.clear();
		password.sendKeys("Test@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
		Thread.sleep(2000);
		WebElement value = driver.findElement(By.xpath("//span[text()='Invalid credentials']"));
		String color = value.getCssValue("color");
		System.out.println(color);
		driver.close();
		
		
		
		
		
	}

}
