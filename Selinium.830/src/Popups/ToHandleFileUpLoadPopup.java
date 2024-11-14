package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleFileUpLoadPopup 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.freshersworld.com/user/register");
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\manik\\OneDrive\\Desktop\\RESUME\\Resume Word\\MANI\\RESUME.docx");
		
	}

}
