package Webdriver;
// manage method having --> windows---> maximize(),minimize(),fullscreen().
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnManage 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.manage().window().fullscreen();
		driver.manage().window().minimize();
	
		
		
		
		
		
	}

}
