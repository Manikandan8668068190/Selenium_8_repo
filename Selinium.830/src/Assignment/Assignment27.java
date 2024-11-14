package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment27 
{
	public static void main(String[] args) throws WebDriverException, IOException, InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();

		if(driver.getTitle().equals("DemoApps | Qspiders"))
			System.out.println("user navigate succesfully");
		else
			System.out.println("user failed to navigate ");
		
		driver.findElement(By.xpath("//section[text()='Web Table']")).click();
		driver.findElement(By.xpath("//a[text()='Dynamic Web Table']")).click();
		Thread.sleep(10000);
		String discount =driver.findElement(By.xpath("//*[@id=\"demoUI\"]/main/section/article[1]/aside/div/div[2]/table/tbody/tr[4]/td[3]")).getText(); 
		System.out.print(discount);
		FileHandler.copy(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE), new File("./scrshot/demowebapp.png"));
//		driver.quit();
		
	}

}
