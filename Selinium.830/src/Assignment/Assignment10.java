package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment10 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/");
		driver.findElement(By.partialLinkText("SIGNUP")).click();
		Thread.sleep(3000);
		driver.getCurrentUrl();
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("Mani");
		Thread.sleep(1000);
//		driver.findElement(By.name("email")).sendKeys("test@gmail.com");
//		Thread.sleep(1000);
		driver.findElement(By.name("repassword")).sendKeys("8668068190");
		Thread.sleep(1000);
		driver.findElement(By.name("lastname")).sendKeys("Kandan");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("9345623396");
		Thread.sleep(3000);
		driver.findElement(By.name("signup")).click();
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
