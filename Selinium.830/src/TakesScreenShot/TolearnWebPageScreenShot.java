package TakesScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TolearnWebPageScreenShot {

	public static void main(String[] args) throws IOException 
	{
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		
//		driver.get("https://demowebshop.tricentis.com/");
//		
//		TakesScreenshot ts=(TakesScreenshot) driver;
//		File temp = ts.getScreenshotAs(OutputType.FILE);
//		File dest = new File("./screenshots/images.png");
//		FileHandler.copy(temp, dest);
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/register");
		File temp = driver.getScreenshotAs(OutputType.FILE);
		File dept = new File("./screenshots/images2.png");
		FileHandler.copy(temp, dept);
		
		
		
		
		
	}

}
