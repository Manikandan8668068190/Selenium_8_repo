package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment35 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame);
		
		WebElement image1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement image2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		
		WebElement trash = driver.findElement(By.id("trash"));
		
		Actions act=new Actions(driver);
		
		act.pause(2000).dragAndDrop(image1, trash).perform();
		act.pause(1000).dragAndDrop(image2, trash).perform();
		
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(@href,'https://www.globalsqa.com/cheatsheets/')][1]")).click();
		
		driver.findElement(By.xpath("//a[text()='SQL Cheat Sheet']")).click();
		
	
		
//		act.scrollByAmount(1022,501).perform();
		WebElement joins = driver.findElement(By.xpath("//div[@class='four columns'][1]"));
		act.scrollToElement(joins).perform();
		
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		File temp = ts.getScreenshotAs(OutputType.FILE);
//		File dest = new File("./scrshot/image4.png");
//		FileHandler.copy(temp, dest);
	}
	
	
}
