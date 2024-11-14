package AutomationPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice1 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://automationexercise.com/");
		
		driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		boolean visiblity = driver.findElement(By.xpath("//button[text()='Signup']")).isDisplayed();
		System.out.println("login button is visible "+visiblity);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Manikandan");
		driver.findElement(By.xpath("(//input[@type='email'])[2]")).sendKeys("mani619@gmail.com");
		
		driver.findElement(By.xpath("//button[text()='Signup']")).click();
		boolean informationStatus = driver.findElement(By.xpath("//b[text()='Enter Account Information']")).isDisplayed();
		System.out.println("Account information Status is "+informationStatus);
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.id("password")).sendKeys("Mani@123");
		
		WebElement dayList = driver.findElement(By.id("days"));
		WebElement MonthList = driver.findElement(By.id("months"));
		WebElement yearList = driver.findElement(By.id("years"));
		
		Select daySelect=new Select(dayList);
		Select MonthSelect=new Select(MonthList);
		Select YearSelet=new Select(yearList);
		
		daySelect.selectByVisibleText("8");
		MonthSelect.selectByVisibleText("April");
		YearSelet.selectByVisibleText("1998");
		
		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("optin")).click();
		
		driver.findElement(By.id("first_name")).sendKeys("Mani");
		driver.findElement(By.id("last_name")).sendKeys("kandan");
		
	
		
	}

}
