package smokeTests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class PageTitleUnitTest {
	
	WebDriver driver;
	String webURL = "http://sdettraining.com/trguitransactions/AccountManagement.aspx";
	
	@Test
	public void pageTitleTest() {
		
		System.out.println("At test");
		driver.get(webURL);
		String actualValue = driver.getTitle();
		System.out.println(actualValue);
		String expectedValue = "SDET Training | Account Management";
		Assert.assertEquals(expectedValue, actualValue);
		
	}
	
	
	@Before
	public void setUp() {
		System.out.println("Before test");
		driver = utilities.DriverFactory.open("chrome");
	}
	
	@After
	public void tearDown() {
		System.out.println("closing the test");
		driver.quit();
		
	}
	
}