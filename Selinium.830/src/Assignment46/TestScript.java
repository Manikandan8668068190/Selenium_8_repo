package Assignment46;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript 
{
	@Test
	public void login() throws IOException 
	{
		//step 1:create FIS object
		FileInputStream fis=new FileInputStream("./testdata/Commands.properties");
		FileInputStream fis1=new FileInputStream("./testdata/testscriptdata1.xlsx");
		
		//step 2: Create property file type object
		Properties prop=new Properties();
		Workbook workbook = WorkbookFactory.create(fis1);
		
		//step 3:Call read method
		prop.load(fis);
		String URL = prop.getProperty("url");
		
		String USER = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String PASS = workbook.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(URL);
		WelcomePage wp=new WelcomePage(driver);
		wp.getLoginLink().click();
		
		LoginPage lp=new LoginPage(driver);
		lp.getEmailtextfield().sendKeys(USER);
		lp.getPasswordtextfield().sendKeys(PASS);
		lp.getLoginbutton().click();
		
		Reporter.log("login succesfully", true);
	}			
}


