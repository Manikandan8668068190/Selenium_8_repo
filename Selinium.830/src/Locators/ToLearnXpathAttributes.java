 package Locators;
//
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//
public class ToLearnXpathAttributes 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Search store']")).sendKeys("printer");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
//		Thread.sleep(2000); //xpath by attribute()
//		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
////		driver.close();
//	
		
	}
}

