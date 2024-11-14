
package SelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnSingleSelectListBox 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/reg/?next=%2FnopCommerce");
		WebElement daydropdown = driver.findElement(By.id("day"));
		WebElement monthdropdown = driver.findElement(By.id("month"));
		WebElement yeardropdown = driver.findElement(By.id("year"));
		Select daySelect=new Select(daydropdown);
		Select monthselect= new Select(monthdropdown);
		Select yearSelect=new Select(yeardropdown);
		//three ways to select options
		
//		monthselect.selectByIndex(0);//by using index values
//		monthselect.selectByValue("8");//by using values of month
		daySelect.selectByVisibleText("8");
		monthselect.selectByVisibleText("Apr");//by using month name 
		yearSelect.selectByVisibleText("1998");
		
	}
	

}
