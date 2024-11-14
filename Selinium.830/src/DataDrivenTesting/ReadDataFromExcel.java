package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromExcel 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
	//Step 1: Create FileInputStream Object
	FileInputStream fis=new FileInputStream("./testdata/testscriptdata.xlsx/");
	
	//Step2: Create respective file type obj
	Workbook workbook = WorkbookFactory.create(fis);
	
	//Step3: call read method
	String url = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	String username = workbook.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
	String password = workbook.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
	
	System.out.println(url);
	System.out.println(username);
	System.out.println(password);
	
	double price = workbook.getSheet("Sheet1").getRow(1).getCell(3).getNumericCellValue();
	System.out.println(price);
	
	boolean status = workbook.getSheet("Sheet1").getRow(1).getCell(4).getBooleanCellValue();
	System.out.println(status);
	
	LocalDateTime date = workbook.getSheet("Sheet1").getRow(1).getCell(5).getLocalDateTimeCellValue();
	System.out.println(date);
	
	System.out.println(date.getMonth());
	System.out.println(date.getDayOfMonth());
	System.out.println(date.getYear());
	
	
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get(url);
	driver.findElement(By.linkText("LOGIN")).click();
	driver.findElement(By.id("email")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password);
	driver.findElement(By.id("last")).click();
	Thread.sleep(2000);
	driver.quit();
	
	}

}
