package Webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetWindowHandles {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/products_page/15");
		Thread.sleep(40000);
		driver.findElement(By.id("compare")).click();
		Thread.sleep(3000);
		Set<String> allWindowsId = driver.getWindowHandles();
		System.out.println(allWindowsId);
		for(String s:allWindowsId)
		{
			System.out.println(s);
		}

	}

}
