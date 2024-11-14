package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryPage 
{
	//Declaration
	@FindBy(id = "navbar-search-input")
	private WebElement searchtf;
	
	//initializzation
	public SkillraryPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getSearchtf() {
		return searchtf;
	}
	

}
