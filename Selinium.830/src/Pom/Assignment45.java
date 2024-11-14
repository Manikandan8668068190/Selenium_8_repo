package Pom;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment45 {
	public static void main(String[] args) throws IOException {
		// property file accesing
		// step 1: create FIS object
		FileInputStream fis = new FileInputStream("./testdata/CommandData.properties");

		// step 2: create respective file type object
		Properties prop = new Properties();

		// call read method
		prop.load(fis);

		String url = prop.getProperty("url");

		// excel file accessing
		// step1
		FileInputStream fis1 = new FileInputStream("./testdata/testscriptdata.xlsx");
		// step2
		Workbook workbook = WorkbookFactory.create(fis1);
		// step3
		String first = workbook.getSheet("Sheet2").getRow(1).getCell(0).getStringCellValue();
		String last = workbook.getSheet("Sheet2").getRow(1).getCell(1).getStringCellValue();
		String email = workbook.getSheet("Sheet2").getRow(1).getCell(2).getStringCellValue();
		String password = workbook.getSheet("Sheet2").getRow(1).getCell(3).getStringCellValue();
		String cpassword = workbook.getSheet("Sheet2").getRow(1).getCell(4).getStringCellValue();
		String expectedresult = workbook.getSheet("Sheet2").getRow(1).getCell(5).getStringCellValue();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get(url);
		WelcomePage1 wp = new WelcomePage1(driver);
		wp.getRegisterLink().click();
		RegisterPage rp = new RegisterPage(driver);
		rp.getGenderradiobutton().click();
		rp.getFirstnametextfield().sendKeys(first);
		rp.getLastnametextfield().sendKeys(last);
		rp.getEmailtextfield().sendKeys(email);
		rp.getPasswordtextfield().sendKeys(password);
		rp.getConfirmpasswordtextfield().sendKeys(cpassword);
		rp.getRegisterbutton().click();
		String text = rp.getActualresult().getText();

		if (text.contains(expectedresult)) {
			System.out.println("register succesfully");
		} else {
			System.out.println("register unsuccessfull");
		}

	}

}
