package rajatSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import library.Utility;



public class FacebookScreenshot {
	@Test
	public void openFacebookFirefox() throws Exception 
	{
		WebDriver driver =Utility.browserSelect("firefox");
		driver.get("http://www.facebook.com");
		Utility.captScreen(driver, "FireFox_Facebook");
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("rajat.mhjn");
		Utility.captScreen(driver, "FireFox_userName");
		driver.quit();
	}
	
	@Test
	public void openFacebookChrome() throws Exception 
	{
		WebDriver driver =Utility.browserSelect("chrome");
		driver.get("http://www.facebook.com");
		Utility.captScreen(driver, "Chrome_Facebook");
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("rajat.mhjn");
		Utility.captScreen(driver, "Chrome_userName");
		driver.quit();
	}
}


