package Popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.shoppersstack.com/products_page/155");
		driver.findElement(By.id("compare")).click();
		
		Set<String> allwindowIds = driver.getWindowHandles();
		
		for(String ids:allwindowIds)
		{
			driver.switchTo().window(ids);
			String url = driver.getCurrentUrl();
			if(url.contains("flipkart"))
			{
				break;
			}
		}
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
