package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import testbase.ReusableMethods;
import testbase.basetest;

public class TC_002  extends basetest{
	
	@Test
	public void verify_Login()
	{
		try
		{
			logger.info("**Login initiated**");
			Loginpage lp = new Loginpage(driver);
			lp.SetEmail(prop.getProperty("Email"));
			lp.SetPassword(prop.getProperty("Password"));
			lp.Enter_Submit();
			logger.info("**Login finished**");
			
			
			logger.info("**Homepage Loaded**");
			Homepage hp = new Homepage(driver);
			Thread.sleep(3000);
			ReusableMethods rp = new ReusableMethods(driver);
			rp.element_wait(hp.profile);
			hp.click_profile();
			String getvalue=hp.get_value();
			Assert.assertEquals(getvalue, prop.getProperty("Email"));
			logger.info("**Homepage finished**");
		}
		catch (Exception e)
		{
			Assert.fail();
			logger.debug("Bebug detailed");
		}
		
	}

}
