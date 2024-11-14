package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnDragAndDrop 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement photoframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(photoframe);
		
		WebElement image1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));// source
		WebElement image2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));//source
		
		
		WebElement trash = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-state-default ui-droppable']"));//target
		
		Actions act=new Actions(driver);
		act.dragAndDrop(image1, trash).perform();
		act.dragAndDrop(image2, trash).perform();
		
		WebElement gallery = driver.findElement(By.id("gallery"));//
		
		
		act.pause(2000).dragAndDrop(image1, gallery).perform();
		act.pause(2000).dragAndDrop(image2, gallery).perform();
		
		
		
		
	}

}
