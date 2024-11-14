package Webdriver;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLearnGet 
{
	public static void main(String[] args) 
	{
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new EdgeDriver();
		
		//driver.get("https://www.flipkart.com/");
		//driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=7857573451749053163&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062010&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		driver.get("https://www.youtube.com/");
		//driver.get("https://www.instagram.com/");
		
	}

}
