package Assignment;
//i want to trace this program for my reference
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment18 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.shoppersstack.com/products_page/107");
		Thread.sleep(15000);
		String parentId = driver.getWindowHandle();
		driver.findElement(By.id("compare")).click();
//Interchanging the child window by using create method (switchToWindow)
		
		switchToWindow(driver, "flipkart");
		Point flipkartPosition = driver.manage().window().getPosition();
		
		switchToWindow(driver,"ebay");
		Point ebayPosition = driver.manage().window().getPosition();
		driver.manage().window().setPosition(flipkartPosition);
		
		switchToWindow(driver,"flipkart");
		driver.manage().window().setPosition(ebayPosition);

	}
//creating (reusable method) for interchanging the child windows 
	public static void switchToWindow(WebDriver driver, String url) {
		Set<String> allWindowIds = driver.getWindowHandles();
		for(String id: allWindowIds)
		{
			driver.switchTo().window(id);
			String actUrl = driver.getCurrentUrl();
			if(actUrl.contains(url))
			{
				break;
			}
		}

	}

}
