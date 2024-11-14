package Assignment;
/*ASSIGNMENT 8
 *
 8) Open DemoWebShop Application and click on registor Link
 then fill the all details then click on register button.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("Gender")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("FirstName")).sendKeys("Mani");
		Thread.sleep(1000);
		driver.findElement(By.name("LastName")).sendKeys("Kandan");
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys("mani619@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("Password")).sendKeys("8668068190");
		Thread.sleep(1000);
		driver.findElement(By.name("ConfirmPassword")).sendKeys("8668068190");
		Thread.sleep(1000);
		driver.findElement(By.id("register-button")).click();
//		Thread.sleep(4000);
//		driver.close();
	}

}
