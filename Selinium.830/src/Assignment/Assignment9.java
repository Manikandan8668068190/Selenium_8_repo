package Assignment;
/*ASSIGNMENT 9
 * 
 9) Open "https//www.skillsrary.com" then click on the "Login" link
 and enter email & password as admin & admin. then click on the login 
 button ,check home page should be displayed or not and then close
 the application 
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment9 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/");
		Thread.sleep(1000);
		driver.findElement(By.linkText("LOGIN")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
