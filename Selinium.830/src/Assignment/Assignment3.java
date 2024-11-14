package Assignment;
/*ASSIGNMENT 3
 * 
3) Open RedBus Application and Capture the source code 
and print it on the console then close the application. 
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		String sourceCode=driver.getPageSource();
		System.out.println(sourceCode);
		
		
	}

}
