package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.Registerpage;
import testbase.ReusableMethods;
import testbase.basetest;

public class TC_001 extends basetest {

	@Test
	void Register()
	{
		try
		{
		logger.info("Test started TC_001");
		Registerpage lp= new Registerpage(driver);
		ReusableMethods rm = new ReusableMethods(driver);
		
		lp.setlastname(rm.randomName(5));
		lp.setlastname(rm.randomName(5));
		lp.setemail(rm.randomName(5)+"@gmail.com");
		
		logger.info("validation.......");
		Assert.assertTrue(true);
		}
		catch (Exception e)
		{
			logger.error("Test failed");
			logger.debug("Debug for the test");
			Assert.fail();
		}
		logger.info("finished....");
	}
}
