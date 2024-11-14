package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.net.Urls;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment40 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://www.shoppersstack.com/products_page/155");
		driver.findElement(By.id("compare")).click();
		
		Set<String> allwindowIds = driver.getWindowHandles();
		
		for(String str:allwindowIds)
		{
			driver.switchTo().window(str);
			String urls = driver.getCurrentUrl();
			if (urls.contains("amazon"))
			{
				break;
			}
		}
		Actions act=new Actions(driver);
		act.scrollByAmount(300, 500).perform();

		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./scrshot/Assignment40.png");
		FileHandler.copy(temp, dest);
		
	}

}
