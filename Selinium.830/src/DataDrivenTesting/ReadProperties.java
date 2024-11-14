package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadProperties 
{
	public static void main(String[] args) throws IOException 
	{
		//step 1: Create FileInputStream Object
		FileInputStream fis=new FileInputStream("./testdata/Read.properties");
		
		//step 2: Create respective File type object
		Properties prop=new Properties();
		
		//step 3: Call Read Methods
		prop.load(fis);
		
		String URL = prop.getProperty("Url");
		String FIRST = prop.getProperty("FirstName");
		String LAST = prop.getProperty("LastName");
		String EMAIL = prop.getProperty("Email");
		String PASS = prop.getProperty("Password");
		String CPASS = prop.getProperty("ConfirmPassword");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(URL);
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.id("FirstName")).sendKeys(FIRST);
		driver.findElement(By.id("LastName")).sendKeys(LAST);
		driver.findElement(By.id("Email")).sendKeys(EMAIL);
		driver.findElement(By.id("Password")).sendKeys(PASS);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(CPASS);
		
		driver.findElement(By.id("register-button")).click();
		
		String conformation = driver.findElement(By.xpath("//div[@class='result']")).getText();
		System.out.println(conformation);

	
	}
	

}
