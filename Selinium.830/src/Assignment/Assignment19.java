package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment19 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Facebook")).click();
		switchToMethod(driver,"facebook");
		driver.findElement(By.xpath("//span[text()='Create new account']")).click();
		switchToMethod(driver, "reg/?next");
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("mani");
		
	}
	public static void switchToMethod(WebDriver driver,String url) {
		Set<String> allWindowsId = driver.getWindowHandles();
		
		for (String string : allWindowsId) {
			driver.switchTo().window(string);
			
			String actUrl = driver.getCurrentUrl();
			if(actUrl.contains(url))
				break;
		}
	}
}
