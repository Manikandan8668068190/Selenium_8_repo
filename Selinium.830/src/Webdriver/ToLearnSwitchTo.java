package Webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitchTo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/products_page/15");
		Thread.sleep(35000);
		String parentId = driver.getWindowHandle();
		driver.findElement(By.id("compare")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		
		for(String id:allWindows)
		{
			driver.switchTo().window(id);
			Thread.sleep(2000);
			String url = driver.getCurrentUrl();
			if(url.contains("flipkart"))
				break;
			System.out.println(url);
		}
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("mobiles");
		Thread.sleep(2000);
		driver.switchTo().window(parentId);
		Thread.sleep(2000);
		driver.findElement(By.id("men")).click();
			
	}

}
