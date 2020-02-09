package smokeTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ATagsTest {
	WebDriver driver;
	
	@Test
	public void ATagsTestLink() {
		
		System.out.println("Running test");
		
		List <WebElement> aElements = driver.findElements(By.tagName("a")); 
 		boolean logingEmailBox = driver.findElement(By.id("MainContent_txtUserName")).isDisplayed();
		boolean passwordTextBox = driver.findElement(By.id("MainContent_txtPassword")).isDisplayed();
		boolean createAccountPresent = false;
		Assert.assertTrue(logingEmailBox, "Login Box is not present");
		Assert.assertTrue(passwordTextBox, "Password Text box is present");
		 for (WebElement aElement : aElements) {
			 System.out.println(aElement.getText());
			 if (aElement.getText().equals("CREATE ACCOUNT")) {
				 createAccountPresent = true;
				 
			 }
		 }
		Assert.assertTrue(createAccountPresent);
	}
	@BeforeMethod
	public void beforeTest() {
		System.out.println("Before method");
		String webUrl = "http://sdettraining.com/trguitransactions/AccountManagement.aspx";
	
		driver = utilities.DriverFactory.open("chrome");
		driver.get(webUrl);
		
	}
	@AfterMethod
	public void afterTest() {
		System.out.println("Aftermethod");
		driver.quit();
	}
}
