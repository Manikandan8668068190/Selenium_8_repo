package SeleniumTest;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Webdriver.ToLearnSwitchTo;

public class Test2 
{
	

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		String time = LocalDateTime.now().toString().replace(":", "-");
		
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		WebElement country = driver.findElement(By.id("sView1:r1:0:country::content"));
		
		
		Select selectcountry=new Select(country);
		List<WebElement> alloptions = selectcountry.getOptions();
		selectcountry.selectByVisibleText("Zimbabwe");
//		selectcountry.selectByIndex(alloptions-1);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./scrshot/"+time+".png");
		FileHandler.copy(temp, dest);
		Thread.sleep(2000);
		driver.findElement(By.linkText("Oracle.com Terms of Use")).click();
		Thread.sleep(2000);
//		ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window((String) tabs.get(1));
		
		/*
		Set<String> allwindowids = driver.getWindowHandles();
		String onewindow = driver.getWindowHandle();
		
		for (String handle : allwindowids) {
            if (handle.equals(onewindow)) {
                // Switch to the next tab
                driver.switchTo().window(handle);
                break; // exit the loop after switching
            }
		}
		*/
		Set<String> allwindowids = driver.getWindowHandles();
		for(String ele:allwindowids)
		{
			driver.switchTo().window(ele);
			{
				if(driver.getTitle().contains("https://www.oracle.com/legal/terms/"))
				{
					break;
				}
			}
		}
		List<WebElement> Allheadings = driver.findElements(By.tagName("h3"));
		for(WebElement ele:Allheadings )
		{
			System.out.println(ele.getText());
		}
	}

}

