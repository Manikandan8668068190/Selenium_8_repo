package SelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnGetOptions 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/reg");
		WebElement monthlist = driver.findElement(By.id("month"));
		WebElement yearlist = driver.findElement(By.id("year"));
		Select monthselect=new Select(monthlist);
		Select yearselect=new Select(yearlist);
		List<WebElement> allmonths = monthselect.getOptions();
		List<WebElement> allyears = yearselect.getOptions();
		System.out.println(allmonths.size());
		System.out.println(allyears.size());
		
		for(WebElement ele :allmonths)
		{
			System.out.println(ele.getText());
		}
		
	}

}
