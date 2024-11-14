package Assignment;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment34 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		
		WebElement frame = driver.findElement(By.xpath("//iframe[contains(@src,'https://api-prod.capcvet.org/api/embed/pda/')]"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("region-27")).click();

		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		
		driver.findElement(By.id("user")).sendKeys("mani619@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Test@123");
		driver.findElement(By.id("cpass")).sendKeys("Test@123");
		driver.findElement(By.id("firstName")).sendKeys("mani");
		driver.findElement(By.id("lastName")).sendKeys("kandan");
		driver.findElement(By.id("phone")).sendKeys("9876543210");
		WebElement usertype = driver.findElement(By.id("user-type"));
		
		Select othertypeselect=new Select(usertype);
		othertypeselect.selectByVisibleText("Pet Owner");
		driver.findElement(By.id("accept-tou")).click();
		WebElement checkbox = driver.findElement(By.xpath("//button[@value='Register']"));
		checkbox.click();
	}

}
