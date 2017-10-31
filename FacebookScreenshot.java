package rajatSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import library.Utility;



public class FacebookScreenshot {
	
	
	//To Test multiple browser launch --- Firefox
	/*@Test
	public void openFacebookFirefox() throws Exception 
	{
		WebDriver driver =Utility.browserSelect("firefox");
		driver.get("http://www.facebook.com");
		Utility.captScreen(driver, "FireFox_Facebook");
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("rajat.mhjn");
		Utility.captScreen(driver, "FireFox_userName");
		driver.quit();
	}
	
	
	//To Test multiple browser launch --- Chrome
	@Test
	public void openFacebookChrome() throws Exception 
	{
		WebDriver driver =Utility.browserSelect("chrome");
		driver.get("http://www.facebook.com");
		Utility.captScreen(driver, "Chrome_Facebook");
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("rajat.mhjn");
		Utility.captScreen(driver, "Chrome_userName");
		driver.quit();
	}*/
	
	//To Test drap and drop using Actions Class(Fails due to IFrame Yet to learn IFrame)
	/*@Test
	public void testDragAndDropViaActionsClass() throws Exception {
		WebDriver driver = Utility.browserSelect("Chrome");
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(5000);
		WebElement source = driver.findElement(By.xpath(".//*[@id='draggable']"));
		WebElement destination = driver.findElement(By.xpath(".//*[@id='droppable']"));
		Utility.dragAndDrop(source, destination, driver);
		Thread.sleep(1000);
		Utility.captScreen(driver, "dragAndDropTest");
		driver.quit();
		
	}*/
	
	
	//Explict wait
	@Test
	public void checkExplictWait()
	{
		WebDriver driver = Utility.browserSelect("chrome");
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement clickElement =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Click me to start timer']")));
		clickElement.click();
		WebElement textWebDriver = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
		if(textWebDriver.isDisplayed()) {
			System.out.println("Text Webdriver is Present");
			
		}
		else
		{
			System.out.println("Text Webdriver is not Present");
		}
		driver.close();
	}
	
}


