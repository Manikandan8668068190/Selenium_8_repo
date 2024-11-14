package Assignment;
/*ASSIGNMENT 6
 * 
 6) Open Amazon in maximized mode without using get()
 & verify Welcome page is displayed or not then perform 
 back & fourth Operation
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.amazon.in/");
		String title = driver.getTitle();
		
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.close();
		System.out.println(title);


	}

}
