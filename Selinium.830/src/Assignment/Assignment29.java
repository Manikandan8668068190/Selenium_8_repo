package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;


public class Assignment29
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		driver.get("https://www.freshersworld.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='REGISTER NOW']")).click();
		driver.findElement(By.id("firstname")).sendKeys("Mani");
		driver.findElement(By.id("lastname")).sendKeys("kandan");
		driver.findElement(By.id("email")).sendKeys("mani619@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("manikandan");
		driver.findElement(By.id("mobile")).sendKeys("8668068190");
		WebElement city = driver.findElement(By.id("currentCity"));
		WebElement course = driver.findElement(By.id("course"));
		Select citylist=new Select(city);
		Select courselist=new Select(course);
		Thread.sleep(2000);
		citylist.selectByVisibleText("Bangalore");
		courselist.selectByVisibleText("BE/B.Tech");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./scrshot/image.png");
		FileHandler.copy(temp, dest);
		
		
		
	}

}
