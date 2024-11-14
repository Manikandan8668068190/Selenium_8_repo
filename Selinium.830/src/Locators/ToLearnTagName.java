package Locators;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnTagName 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> allLinks = driver.findElements(By.tagName("img"));
		
//		List<String> name=new ArrayList<String>();
//		name.add("mani");
//		name.add("mani");
//		name.add("mani");
//		System.out.println(name);
		
		for(WebElement ele:allLinks)
		{
			System.out.println(ele.getText());
		}
		driver.close();
		
		
	}

}
