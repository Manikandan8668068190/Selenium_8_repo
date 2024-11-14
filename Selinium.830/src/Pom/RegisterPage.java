package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage
{
	//declaration
	@FindBy(id = "gender-male")
	private WebElement genderradiobutton;
	
	@FindBy(id = "FirstName")
	private WebElement firstnametextfield;
	
	@FindBy(id = "LastName")
	private WebElement lastnametextfield;
	
	@FindBy(id = "Email")
	private WebElement emailtextfield;
	
	@FindBy(id = "Password")
	private WebElement passwordtextfield;
	
	@FindBy(id = "ConfirmPassword")
	private WebElement confirmpasswordtextfield;
	
	@FindBy(id = "register-button")
	private WebElement registerbutton;
	
	@FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
	private WebElement actualresult;
	
	//initialization
	public RegisterPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);

	}
	//getters

	public WebElement getGenderradiobutton() {
		return genderradiobutton;
	}

	public WebElement getFirstnametextfield() {
		return firstnametextfield;
	}

	public WebElement getLastnametextfield() {
		return lastnametextfield;
	}

	public WebElement getEmailtextfield() {
		return emailtextfield;
	}

	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}

	public WebElement getConfirmpasswordtextfield() {
		return confirmpasswordtextfield;
	}

	public WebElement getRegisterbutton() {
		return registerbutton;
	}

	public WebElement getActualresult() {
		return actualresult;
	}
	

}
