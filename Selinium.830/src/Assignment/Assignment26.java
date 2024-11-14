package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment26 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		String time = LocalDateTime.now().toString().replace(":","-");
		
		driver.get("https://www.getcalley.com/page-sitemap.xml");
		
		String[] urls= {"https://www.getcalley.com/","https://www.getcalley.com/calley-lifetime-offer/","https://www.getcalley.com/see-a-demo/"};
		for(int i=0; i<urls.length;i++)
		{
			driver.findElement(By.linkText(urls[i])).click();
			
			TakesScreenshot ts=(TakesScreenshot)driver;
			File temp = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("./scrshot/"+time+".png");
			FileHandler.copy(temp, dest);
			driver.manage().window().setPosition(new Point(1366,768));
			Thread.sleep(2000);
			driver.navigate().back();
			
		}		
	}

}
