package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Sample 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.redbus.in/");
		String Title= driver.getTitle();
		System.out.println(Title);
		if(Title.equals("Bus Ticket Booking Online made Easy, Secure with Top Bus Operators"))
		{
			System.out.println("RedBus Home page Should be displayed");
		}
		else
		{
			System.out.println("Redbus home page FAILS to open");
		}
		

		
	}
	
}



