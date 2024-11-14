package Assignment;
/*ASSIGNMENT 1
 * 
 1) Open Instagram application in Chrome browser and verify Welcome 
 page is Displayed or not ?
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Instagram"))
		{
			System.out.println("Welcome page will be Displayed");
		}
		else
		{
			System.out.println("fails to show welcome page");
		}
	}

}
