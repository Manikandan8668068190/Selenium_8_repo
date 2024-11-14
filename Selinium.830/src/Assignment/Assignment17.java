package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment17 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.shoppersstack.com/beauty_products");
		Thread.sleep(50000);
		driver.findElement(
				By.xpath("//span[text()='FAIR AND HANDSOME 2X Spot Reduction...']/../..//button[text()='add to cart']"))
				.click();

	}

}
