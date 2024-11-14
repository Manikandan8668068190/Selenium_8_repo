package Pom;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage1 
{
	//declaration
	@FindBy(linkText = "Register")
	private WebElement registerLink;
	
	//initialization
	public WelcomePage1(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	//getters

	public WebElement getRegisterLink() {
		return registerLink;
	}

	

}
