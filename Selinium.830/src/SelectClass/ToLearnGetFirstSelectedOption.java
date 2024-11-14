package SelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnGetFirstSelectedOption 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement pricelist = driver.findElement(By.id("cars"));
		Select priceselect=new Select(pricelist);
//		priceselect.selectByIndex(0);
//		priceselect.selectByIndex(1);
//		priceselect.selectByIndex(3);
		
//		WebElement firstoption = priceselect.getFirstSelectedOption();//getFirstSelectedOption()
//		System.out.println(firstoption.getText());
		
		List<WebElement> alloptions = priceselect.getAllSelectedOptions();//getallselectedoption()
		
		for(WebElement ele:alloptions)
		{
			System.out.println(ele.getText());
		}

		
	}

}
