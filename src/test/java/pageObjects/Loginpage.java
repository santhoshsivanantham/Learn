package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testbase.Basepage;

public class Loginpage extends Basepage{

	//driver invoke
	public Loginpage(WebDriver driver) {
		super(driver);
	}
	
	//Listing all the locators
	@FindBy (name="email")
	WebElement Email;
	
	@FindBy (name="password")
	WebElement Password;
	
	@FindBy (xpath="//span[normalize-space()='Submit']")
	WebElement submit;
	
	
	//Actions in the page
	public void SetEmail(String email)
	{
		Email.sendKeys(email);
	}
	
	public void SetPassword(String password)
	{
		Password.sendKeys(password);
	}
	
	public void Enter_Submit()
	{
		submit.click();
	}
	
	

}
