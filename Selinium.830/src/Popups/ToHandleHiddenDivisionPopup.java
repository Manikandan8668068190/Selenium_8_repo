package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleHiddenDivisionPopup 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.get("https://www.makemytrip.com/?srsltid=AfmBOorXxDPQFh8n4sJOuJSH0hAwjjLbTWgvvA5yfKd1auj0QdLvsnSH");
		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
		driver.findElement(By.xpath("//p[@data-cy='departureDate']")).click();
		
		String month="May";
		int date=18;
		int year=2025;
		
		while(true)
			{
		try 
		{
			driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/../..//p[text()='"+date+"']")).click();
			break;
		}
		catch (Exception e) 
		{
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		}
			}
		
	}

}
