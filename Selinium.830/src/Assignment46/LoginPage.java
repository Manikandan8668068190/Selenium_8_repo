package Assignment46;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	//declaration
	@FindBy(id = "email")
	private WebElement emailtextfield;
	
	@FindBy(id = "password")
	private WebElement passwordtextfield;
	
	@FindBy(id = "keepLoggedInCheckBox")
	private WebElement keeplogincheckbox;
	
	@FindBy(id = "toPasswordRecoveryPageLink")
	private WebElement forgetpassword;
	
	@FindBy(id = "last")
	private WebElement loginbutton;
	
	//initialization
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	//getters
	public WebElement getEmailtextfield() {
		return emailtextfield;
	}

	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}

	public WebElement getKeeplogincheckbox() {
		return keeplogincheckbox;
	}

	public WebElement getForgetpassword() {
		return forgetpassword;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	

	
	
	

}
