package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment20 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		WebElement username = driver.findElement(By.name("username"));
//		Thread.sleep(1000);
		username.clear();
//		Thread.sleep(3000);
		username.sendKeys("testing");
//		Thread.sleep(1000);
		WebElement password = driver.findElement(By.name("password"));
//		Thread.sleep(3000);
		password.clear();
//		Thread.sleep(1000);
		password.sendKeys("Test@1234");
//		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
//		Thread.sleep(2000);
		driver.close();

	}

}
