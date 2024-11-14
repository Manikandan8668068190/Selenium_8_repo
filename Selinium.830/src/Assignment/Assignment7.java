package Assignment;
/*ASSIGNMENT 7
 * 
 7) Open Naukri application & verify by Capturing Url of the 
 Application then capture X & Y Co-ordination of the webpage
 & refresh the webpage . 
 */

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		String url = driver.getCurrentUrl();
		Thread.sleep(2000);
//		driver.navigate().refresh();
//		Thread.sleep(2000);

		Point position = driver.manage().window().getPosition();
		int x = position.getX();
		int y = position.getY();
		Thread.sleep(2000);
		driver.close();
		System.out.println(url);
		System.out.println("X Value is:" + x);
		System.out.println("Y Value is:" + y);

	}

}
