package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment24 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.abhibus.com/");
//		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()='Hyderabad to Bangalore Bus'])[2]")).click();
//		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='23 Mon']")).click();
//		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Bus Partner']")).click();
//		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Big Bus']/..//input[@type='checkbox']")).click();
//		Thread.sleep(2000);
		List<WebElement> totalBusses = driver.findElements(By.tagName("h5"));
		System.out.println("total busses = "+totalBusses.size());
		
		List<WebElement> totalFare = driver.findElements(By.xpath("//strong[@class='h5 fare']/..//span[text()]"));

		Set<Integer> ts=new TreeSet<Integer>();
		
		for (WebElement object : totalFare) {
			ts.add(Integer.parseInt(object.getText().replace(",", "")));		
		}
		System.out.println(ts);
		
		if (ts.iterator().hasNext())
			System.out.println("Lowest Price : "+ts.iterator().next());
		
		TakesScreenshot ts1=(TakesScreenshot) driver;
		File temp = ts1.getScreenshotAs(OutputType.FILE);
		File dest = new File("./scrshot/images4.png");
		FileHandler.copy(temp, dest);
	}
	

}
