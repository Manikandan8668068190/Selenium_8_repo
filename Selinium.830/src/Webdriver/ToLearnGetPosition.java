package Webdriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetPosition 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		Point position = driver.manage().window().getPosition();
		int x = position.getX();
		int y = position.getY();
		
		System.out.println("X Value is :"+x);
		System.out.println("Y Value is :"+y);
		
	}

}
