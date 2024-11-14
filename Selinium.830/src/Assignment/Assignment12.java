package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment12 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("mani619@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("8668068190");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Demo Web Shop"))
		{
			System.out.println("Demo WebShop Page Should Be Displayed");
		}
		else
		{
			System.out.println("DemoWebShop Page Faild to Displayed");
		}
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		Thread.sleep(4000);
		driver.close();
		
	}

}
