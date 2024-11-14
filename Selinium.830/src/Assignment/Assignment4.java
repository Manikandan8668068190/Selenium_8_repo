package Assignment;
/*ASSIGNMENT 4
 * 
 4) Open Myntra Application and Capture the URL the close 
 the Window by Using quit().
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 
{
	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.myntra.com/men-tshirts");
		
		
		String url = driver.getCurrentUrl();
		System.out.println("THIS IS THE CURRENT URL: "+url);
		System.out.println("------> THE CHROME BROWSER IS CLOSED <------");
		driver.quit();
		
	}

}
