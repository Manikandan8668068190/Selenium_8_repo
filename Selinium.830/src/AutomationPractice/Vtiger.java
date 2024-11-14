package AutomationPractice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Vtiger {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://demo.vtiger.com/vtigercrm/");
	 Set<String> parent = driver.getWindowHandles();
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./scrshot/test.png");
		FileHandler.copy(temp, dest);
		WebElement vtiger = driver.findElement(By.linkText("Vtiger"));
		vtiger.click();
		String vt = driver.getWindowHandle();
		for(String i:parent) {
			System.out.println(i);
		}
		driver.switchTo().window(vt);
		Actions act=new Actions(driver);
		WebElement company = driver.findElement(By.id("navbarLandings"));
		act.moveToElement(company).perform();
		driver.findElement(By.linkText("Contact Us")).click();
		
		
		

			
		
			
		
		
	}

}
