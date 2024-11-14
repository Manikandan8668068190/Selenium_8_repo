package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment28 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']/../..//input[@type='button']")).click();
		String status = driver.findElement(By.xpath("//p[@class='content']")).getText();
		System.out.println(status);
		WebElement popupbg = driver.findElement(By.id("bar-notification"));
		String bg = popupbg.getCssValue("background");
		System.out.println(bg);
		WebElement popup = driver.findElement(By.xpath("//p[@class='content']"));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));//explicit wait condition 
		wait.until(ExpectedConditions.invisibilityOf(popup));
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
//		driver.quit();
		
		
		
	}

}
