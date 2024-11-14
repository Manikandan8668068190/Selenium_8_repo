package JavaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HiddenElements 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/r.php");
		
		WebElement customGender = driver.findElement(By.id("custom_gender"));
		WebElement firstname = driver.findElement(By.name("firstname"));
		WebElement mobileNumber = driver.findElement(By.partialLinkText("Mobile number"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='have a nice day'", customGender);
		js.executeAsyncScript("arguments[0].value='8668068190'", mobileNumber);
		js.executeScript("arguments[0].value='manikandan'", firstname);
	}

}
