package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  String name = "Madona";
		  String email = "test2@test.com";
		  String password = "testpwd";
		  String phoneNumber = "32432423";
		  String country = "India";
		  String browserType = "chrome";
		  boolean weeklyEmail = true;
		  boolean monthlyEmail = false;
		  boolean occassionalEmail = true;
		  String gender = "Female";
		  
		  
		  WebDriver driver;
		  driver = utilities.DriverFactory.open(browserType);
		  driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
		  driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div[2]/a")).click();
		  
		  //Define Web Elements
		  WebElement nameElement = driver.findElement(By.xpath("//*[@id=\"MainContent_txtFirstName\"]"));
		  WebElement emailElement = driver.findElement(By.xpath("//*[@id=\"MainContent_txtEmail\"]"));
		  WebElement phoneElement = driver.findElement(By.xpath("//*[@id=\"MainContent_txtHomePhone\"]"));
		  WebElement maleRadio =driver.findElement(By.cssSelector("input[name='ctl00$MainContent$Gender'][value='Male']"));
		  WebElement femaleRadio =driver.findElement(By.cssSelector("input[name='ctl00$MainContent$Gender'][value='Female']")); 
		  WebElement passwordElement = driver.findElement(By.xpath("//*[@id=\"MainContent_txtPassword\"]"));
		  WebElement verifyPasswordElement = driver.findElement(By.xpath("//*[@id=\"MainContent_txtVerifyPassword\"]"));
		  WebElement countryElement= driver.findElement(By.id("MainContent_menuCountry"));
		  WebElement weeklyCheckBox = driver.findElement(By.name("ctl00$MainContent$checkWeeklyEmail"));
		  WebElement monthlyCheckBox = driver.findElement(By.name("ctl00$MainContent$checkMonthlyEmail"));
		  WebElement occassionalCheckBox = driver.findElement(By.name("ctl00$MainContent$checkUpdates"));
		
		
		
		
		nameElement.sendKeys(name);
		emailElement.sendKeys(email);
		phoneElement.sendKeys(phoneNumber);
		if (gender.equalsIgnoreCase("Male")) {
			maleRadio.click();
		}
		else {
			femaleRadio.click();
		}
		passwordElement.sendKeys(password);
		verifyPasswordElement.sendKeys(password);
		new Select(countryElement).selectByValue(country);
		
		if (weeklyEmail) {
			if (!weeklyCheckBox.isSelected()) {
				weeklyCheckBox.click();				
			}
		}
		else {
			if (weeklyCheckBox.isSelected()) {
				weeklyCheckBox.click();
			}
			
		}
				
		if (monthlyEmail) {
			if (!monthlyCheckBox.isSelected()) {
				monthlyCheckBox.click();				
			}
		}
		else {
			if (monthlyCheckBox.isSelected()) {
				monthlyCheckBox.click();
			}
			
		}
		
		if (occassionalEmail) {
			if (!occassionalCheckBox.isSelected()) {
				occassionalCheckBox.click();				
			}
		}
		else {
			if (occassionalCheckBox.isSelected()) {
				occassionalCheckBox.click();
			}
			
		}	
		
		
		
		driver.findElement(By.id("MainContent_btnSubmit")).click();
		String message = driver.findElement(By.id("MainContent_lblTransactionResult")).getText();
		String expected = "Customer information added successfully";
		if (message.equals(expected)) {
			System.out.println("Confirmation: " + message);
		}
		else {
			System.out.println("Test failed" + message);
		}
			
		
		driver.quit();
		
	
		
	}

}
