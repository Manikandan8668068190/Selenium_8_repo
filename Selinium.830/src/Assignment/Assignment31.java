package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment31 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.linkText("Button")).click();
		driver.findElement(By.linkText("Right Click")).click();
		WebElement rightclick = driver.findElement(By.id("btn30"));
		Actions act=new Actions(driver);
		act.contextClick(rightclick).perform();
		driver.findElement(By.xpath("//div[text()='Yes']")).click();
		WebElement selected = driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']"));
		String text = selected.getText();
		System.out.println(text);
		String color = selected.getCssValue("color");
		System.out.println(color);
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
	}

}
