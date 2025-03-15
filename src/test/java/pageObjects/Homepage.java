package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testbase.Basepage;

public class Homepage extends Basepage{

	public Homepage(WebDriver driver) 
	{
		super(driver);
	}
	
	//List all the locators 
	@FindBy (xpath="//ul[@role='menu']//p[2]")
	WebElement Gmail;
	
	@FindBy (css="div.hidden")
	public WebElement profile;
	
	
	//actions
	public void click_profile()
	{
		profile.click();
	}
	
	public String get_value()
	{
		String title=Gmail.getDomAttribute("title");
		return title;
	}
	
	

}
