package Listeners;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import Assignment50.BaseClass;
import net.bytebuddy.asm.Advice.Local;

public class ListenerImplementation implements ITestListener
{

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		String methodname = result.getName();
		String time = LocalDateTime.now().toString().replace(":","-");
		
		Reporter.log("TestScript Is Failed",true);
		
		TakesScreenshot ts=(TakesScreenshot)BaseClass1.driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./scrshot/"+time+".png");
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	

}
