package Assignment;
/*ASSIGNMENT 2
 * 
 2) Open MakeMyTrip Application in Edge Browser and
  verify Welcome page is displayed or not ?
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment2 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.makemytrip.com/");
		String Title=driver.getTitle();
		System.out.println(Title);
		if(Title.equals("MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday"))
		{
			System.out.println("Welcome page Should be displayed");
		}
		else 
		{
			System.out.println("fails to display");
		}

		
		
	}

}
