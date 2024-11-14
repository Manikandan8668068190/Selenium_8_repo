package Assignment;
/*ASSIGNMENT 5
 *
 5) Open Myntr application in maximized modes page 
 is displayed or not & Capture Height and Width of the 
 application then print it on console .
 */
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/men-tshirts");
	
		Dimension size = driver.manage().window().getSize();
		int height = size.getHeight();
		int width = size.getWidth();
		driver.manage().window().minimize();
		driver.close();
		System.out.println("height of the page is :"+height+"px");
		System.out.println("width of the page is :"+width+"px");	 	
	}

}
