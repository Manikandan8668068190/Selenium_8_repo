package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment16 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		Thread.sleep(3000);
		Set<String> windowIds = driver.getWindowHandles();
			
//		System.out.println(windowIds);
		for(String Ids:windowIds)
		{
			System.out.println(Ids);
		}
		
	}

}
