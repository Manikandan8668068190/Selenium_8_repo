package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetCssValue 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		WebElement register = driver.findElement(By.xpath("//a[text()='Register']"));
		String float1 = register.getCssValue("float");
		String text = register.getCssValue("text-decoration");
		String color = register.getCssValue("color");
		String fontfamily = register.getCssValue("font-family");
		System.out.println(float1);
		System.out.println(text);
		System.out.println(color); 
		System.out.println(fontfamily);
		
		
		
	}

}
