package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement searchtf = driver.findElement(By.id("small-searchterms"));
		WebElement searchbt = driver.findElement(By.xpath("//input[@type='submit']"));
		
		Actions act=new Actions(driver);
		act.sendKeys(searchtf, "Selenium").perform();
		act.click(searchbt).perform();
		
		
	}
	

}
