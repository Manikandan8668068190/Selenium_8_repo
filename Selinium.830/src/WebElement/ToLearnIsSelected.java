package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnIsSelected 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		String rating="Good";
		WebElement status = driver.findElement(By.xpath("//label[text()='"+rating+"']/..//input[@type='radio']"));
		System.out.println("===before Clicking===");
		System.out.println(status.isSelected());
		status.click();
		System.out.println("===after Clicking===");
		System.out.println(status.isSelected());
		
	}
	 
	
		
	
}
	

