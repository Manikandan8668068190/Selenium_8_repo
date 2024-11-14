package Pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		WelcomePage wp=new WelcomePage(driver);
		wp.getLoginLink().click();
		LoginPage lp=new LoginPage(driver);
		lp.getEmailtextfield().sendKeys("mani123@gmail.com");
		lp.getPasswordtextfield().sendKeys("Testing123");
		lp.getLoginbutton().click();
		
	}

}
