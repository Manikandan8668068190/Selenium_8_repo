package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathByAxes {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/manik/OneDrive/Desktop/movieTable.html");
		String collections = driver.findElement(By.xpath("//td[text()='KGF']/following-sibling::td[2]")).getText();
		System.out.println(collections);

	}

}
