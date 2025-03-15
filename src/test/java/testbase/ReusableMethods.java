package testbase;


import java.time.Duration;

import org.apache.commons.text.RandomStringGenerator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusableMethods extends Basepage{
	
	WebDriverWait mywait;
	 public ReusableMethods(WebDriver driver) {
		super(driver);
	}
	 
	// Generate a random alphabetic string (A-Z, a-z)
	public String randomName(int length)
	{
	        RandomStringGenerator generator = new RandomStringGenerator.Builder()
	            .withinRange('a', 'z') // Lowercase letters only
	            .build();
	        return generator.generate(length);
	       
	}
	
	// Generate a random numeric string (0-9)
    public String randomNumeric(int length) 
    {
        RandomStringGenerator generator = new RandomStringGenerator.Builder()
            .withinRange('0', '9') // Numbers only
            .build();
        return generator.generate(length);
    }
    
    
    // Generate a random alphanumeric string (A-Z, a-z, 0-9)
    public String randomAlphanumeric(int length) 
    {
        RandomStringGenerator generator = new RandomStringGenerator.Builder()
            .withinRange('0', 'z') // Includes numbers and letters
            .filteredBy(Character::isLetterOrDigit) // Excludes special characters
            .build();
        return generator.generate(length);
    }
    
   public void element_wait(WebElement loc)
   {
	   mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
	   mywait.until(ExpectedConditions.elementToBeClickable(loc));
   }

}
