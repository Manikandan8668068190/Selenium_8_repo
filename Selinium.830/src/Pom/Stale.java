package Pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale 
/*once the webpage should be refreshed. the id or address of the webpage also refreshed 
 * so we can perform the action on the old id or address in this case we get STALE ELEMENT REFERENCE EXCEPTION 
*/
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/");
		SkillraryPage sp=new SkillraryPage(driver);
		sp.getSearchtf().sendKeys("selenium",Keys.ENTER);
		Thread.sleep(2000);
		sp.getSearchtf().sendKeys("tenstNg",Keys.ENTER);
		Thread.sleep(2000);
		sp.getSearchtf().sendKeys("mobiles",Keys.ENTER);
		
		
		
		
		
		
		
		
		
		
		
//		WebElement searchTF = driver.findElement(By.id("navbar-search-input"));
//		searchTF.sendKeys("selenium",Keys.ENTER);
//		
//		searchTF.sendKeys("testing");
	}

}
