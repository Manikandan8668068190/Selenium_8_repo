package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment11 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.cssSelector("a[class='ico-login']")).click();
		driver.findElement(By.cssSelector("input[class='email']")).sendKeys("mani619@gmail.com");
		driver.findElement(By.cssSelector("input[name='Password']")).sendKeys("8668068190");
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		String title = driver.getTitle();
		System.out.println(title);
	}

}
