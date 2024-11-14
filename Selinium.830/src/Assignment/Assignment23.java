package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment23 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		boolean status = driver.findElement(By.id("newsletter-subscribe-button")).isDisplayed();
		System.out.println(status);
		Rectangle details = driver.findElement(By.id("newsletter-subscribe-button")).getRect();
		System.out.println("Height="+details.getHeight());
		System.out.println("Width="+details.getWidth());
		System.out.println("X position="+details.getX());
		System.out.println("Y position="+details.getY());
		
	}

}
