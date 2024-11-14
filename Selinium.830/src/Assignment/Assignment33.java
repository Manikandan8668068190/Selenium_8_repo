package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment33 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK_New&gad_source=1&gclid=Cj0KCQjwu-63BhC9ARIsAMMTLXRpeuaDbw_j9ZYWLP6H2y9USQ_W1b1ZHZz-rxbeo7jqFAYdbA1Fh4EaAvl7EALw_wcB");
		WebElement kids = driver.findElement(By.partialLinkText("KIDS"));
		
		Actions act=new Actions(driver);
		act.moveToElement(kids).perform();
		WebElement ethnicwear = driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[3]/div/div/div/div/li[1]/ul/li[8]/a"));
		ethnicwear.click();
		boolean status = ethnicwear.isDisplayed();
		System.out.println(status);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./scrshot/image4.png");
		FileHandler.copy(temp, dest);
		
		
		
		
		
		
	}

}
