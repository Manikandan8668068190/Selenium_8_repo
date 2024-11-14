package Assignment;
// click in month dropdown in one by one 
// click in year dropdown in last value by using size()-1
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment30 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/reg");
		WebElement monthlist = driver.findElement(By.id("month"));
		WebElement Yearlist = driver.findElement(By.id("year"));
		
		Select monthselect=new Select(monthlist);
		Select Yearselect=new Select(Yearlist);
		List<WebElement> monthalloptions = monthselect.getOptions();
		List<WebElement> yearalloptions = Yearselect.getOptions();
	
		
		for(WebElement ele:monthalloptions)
		{
			System.out.println(ele.getText());
			monthselect.selectByVisibleText(ele.getText());
			if(ele.isSelected())
			{
				System.out.println(ele.getText()+"--->is selected");
			}
		}
		int indexvalue = yearalloptions.size()-1;
		Yearselect.selectByIndex(indexvalue);
		
//		Yearselect.selectByVisibleText("1905");
//		boolean elem = Yearselect.isMultiple();
//		System.out.println(elem);
	
		
		
	
//		for(WebElement element:yearalloptions)
//		{
//			System.out.println(element.getText());
//			Yearselect.selectByVisibleText(element.getText());
//		
//		}
		Thread.sleep(3000);
		driver.quit();
	
			
		}
	}
