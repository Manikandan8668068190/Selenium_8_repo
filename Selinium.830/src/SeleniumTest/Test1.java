package SeleniumTest;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {
	public static void main(String[] args) throws IOException, InterruptedException {
		String time = LocalDateTime.now().toString().replace(":", "-");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		driver.get("https://www.flipkart.com/");

		List<WebElement> allelements = driver.findElements(By.xpath("//div[@class='YBLJE4']"));

		int i = 1;
		for (WebElement element : allelements) 
		{
			Thread.sleep(2000);
			File temp = element.getScreenshotAs(OutputType.FILE);
			File dest = new File("./scrshot/" + i + "" + time + ""+element.getTagName()+ ".png");
			FileHandler.copy(temp, dest);
			i++;

		}

	}
}
