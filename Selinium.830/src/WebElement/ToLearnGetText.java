package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetText 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(2000);
		String errormgs = driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getText();
		System.out.println(errormgs);
		
//		if(errormgs.contains("Login was unsuccessful"))
//		{
//			System.out.println("Error msg will displayed");
//		}
//		else 
//		{
//			System.out.println("Error msg will not displayed or incorrect");
//			
//		}
	}

}
