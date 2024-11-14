package Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment44 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		
	//Step 1: Create FileInputStream object
		
	FileInputStream fis1=new FileInputStream("./testdata/CommandData.properties");
		
	FileInputStream fis=new FileInputStream("./testdata/Command1.xlsx");
	
	
	//Step 2: Create respective File Type Object
	Properties prop=new Properties();
	Workbook workbook = WorkbookFactory.create(fis);
	
	//Step 3: Call Read Method
	prop.load(fis1);
	
	String URL = prop.getProperty("url");
	String First = workbook.getSheet("register").getRow(1).getCell(0).getStringCellValue();
	String Last = workbook.getSheet("register").getRow(1).getCell(1).getStringCellValue();
	String Email = workbook.getSheet("register").getRow(1).getCell(2).getStringCellValue();
	String password = workbook.getSheet("register").getRow(1).getCell(3).getStringCellValue();
	String cpassword = workbook.getSheet("register").getRow(1).getCell(4).getStringCellValue();
	System.out.println(URL);
	System.out.println(First);
	System.out.println(Last);
	System.out.println(Email);
	System.out.println(password);
	System.out.println(cpassword);
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get(URL);
	driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.id("gender-male")).click();
	driver.findElement(By.id("FirstName")).sendKeys(First);
	driver.findElement(By.id("LastName")).sendKeys(Last);
	driver.findElement(By.id("Email")).sendKeys(Email);
	driver.findElement(By.id("Password")).sendKeys(password);
	driver.findElement(By.id("ConfirmPassword")).sendKeys(cpassword);
	driver.findElement(By.id("register-button")).click();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Log out")).click();
	Thread.sleep(3000);
	driver.quit();
	}

}
