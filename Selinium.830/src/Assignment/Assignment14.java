package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment14 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://demoapps.qspiders.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//section[text()='Web Table']")).click();
//		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/ui/table?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Dynamic Web Table']")).click();
//		Thread.sleep(2000);
//		driver.get("https://demoapps.qspiders.com/ui/table/dynamicTable");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='font-medium text-red-600 dark:text-red-500 hover:underline']")).click();
		Thread.sleep(3000);
		driver.close();
		
	}

}
