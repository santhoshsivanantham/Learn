package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import testbase.Basepage;

public class Registerpage extends Basepage{
	
	 public Registerpage (WebDriver driver)
	{
		super(driver);
	}
	 
	//locator
	@FindBy (xpath="//input[@name='firstName']")
	WebElement firstname; 
	
	@FindBy (name="lastName")
	WebElement lastname; 
	
	@FindBy (name="email")
	WebElement email; 
		
	
	//Actions
	public void setfirstname(String fname)
	{
		firstname.sendKeys(fname);
	}
	
	public void setlastname(String lname)
	{
		lastname.sendKeys(lname);
	}
	
	public void setemail(String emailid)
	{
		email.sendKeys(emailid);
	}

}
