package smokeTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPresentTestNG {
	WebDriver driver;
	
	@Test
	public void loginElementPresentTest() {
		
		driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
		boolean logingEmailBox = driver.findElement(By.id("MainContent_txtUserName")).isDisplayed();
		boolean passwordTextBox = driver.findElement(By.id("MainContent_txtPassword")).isDisplayed();
		
		Assert.assertTrue(logingEmailBox, "Login Box is not present");
		Assert.assertTrue(passwordTextBox, "Password Text box is present");
		
	}
	@BeforeMethod
	public void beforeTest() {
		System.out.println("Before method");
		driver = utilities.DriverFactory.open("chrome");
	}
	
	public void afterTest() {
		System.out.println("Aftermethod");
		driver.close();
	}
}
