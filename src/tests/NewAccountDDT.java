package tests;

import java.util.List;

import org.junit.After;
//import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;




@RunWith(value = Parameterized.class)
public class NewAccountDDT {

	String name; 
	String email;
	String phone;
	String gender;
	String password;
	String country;
	boolean weeklyEmail;
	boolean monthlyEmail; 
	boolean occasionalEmail;
	WebElement nameElement, emailElement, phoneElement, maleRadio, 
	femaleRadio, passwordElement, verifyPasswordElement , countryElement,  weeklyCheckBox, monthlyCheckBox , occasionalCheckBox;
	WebDriver driver;
	
	@Test
	public void newAccountTest() {
		System.out.println(" New Record ---  name:" + name + "	  email: " + email + "	  phone: " + phone + "	  gender: " + gender +
				"	  password: " + password + "	  country: " + country + "	weeklyEmail: " + weeklyEmail+ "	monthlyEmail: " + monthlyEmail + 
				"	occasionalEmail: " + occasionalEmail);
		
		
		  defineWebElements();
		  
		  nameElement.sendKeys(name);
			emailElement.sendKeys(email);
			phoneElement.sendKeys(phone);
			if (gender.equalsIgnoreCase("Male")) {
				maleRadio.click();
			}
			else {
				femaleRadio.click();
			}
			passwordElement.sendKeys(password);
			verifyPasswordElement.sendKeys(password);
			new Select(countryElement).selectByVisibleText(country);
			
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
			
			if (occasionalEmail) {
				if (!occasionalCheckBox.isSelected()) {
					occasionalCheckBox.click();				
				}
			}
			else {
				if (occasionalCheckBox.isSelected()) {
					occasionalCheckBox.click();
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
			
			
		
	}
	
	@Parameters
	public static List<String[]> getData(){
		String filename = "/Users/roopa/Documents/UserAccounts.csv";
		return(utilities.CSV.get(filename));
		
	}
	
	//constructor with parameters
	public NewAccountDDT(String name, String email, String phone, String gender, String password, String country, String weeklyEmail, 
			String monthlyEmail, String occassionalEmail ) {
		
		this.name = name; 
		this.email = email;
		this.phone = phone;
		this.gender = gender;
		this.password = password;
		this.country = country;
		if (weeklyEmail.equals("TRUE")) { this.weeklyEmail = true;}
		else { this.weeklyEmail = false;}
		
		if (monthlyEmail.equals("TRUE")) { this.monthlyEmail = true;}
		else { this.monthlyEmail = false;}
		
		if (occassionalEmail.equals("TRUE")) { this.occasionalEmail = true;}
		else { this.occasionalEmail = false;}
		
	}
	
	public void defineWebElements() {
		//Define Web Elements
		  nameElement = driver.findElement(By.xpath("//*[@id=\"MainContent_txtFirstName\"]"));
		  emailElement = driver.findElement(By.xpath("//*[@id=\"MainContent_txtEmail\"]"));
		  phoneElement = driver.findElement(By.xpath("//*[@id=\"MainContent_txtHomePhone\"]"));
		  maleRadio =driver.findElement(By.cssSelector("input[name='ctl00$MainContent$Gender'][value='Male']"));
		  femaleRadio =driver.findElement(By.cssSelector("input[name='ctl00$MainContent$Gender'][value='Female']")); 
		  passwordElement = driver.findElement(By.xpath("//*[@id=\"MainContent_txtPassword\"]"));
		  verifyPasswordElement = driver.findElement(By.xpath("//*[@id=\"MainContent_txtVerifyPassword\"]"));
		  countryElement= driver.findElement(By.id("MainContent_menuCountry"));
		  weeklyCheckBox = driver.findElement(By.name("ctl00$MainContent$checkWeeklyEmail"));
		  monthlyCheckBox = driver.findElement(By.name("ctl00$MainContent$checkMonthlyEmail"));
		  occasionalCheckBox = driver.findElement(By.name("ctl00$MainContent$checkUpdates"));
		  
	}
	
	@Before
	public void setup() {
		  System.out.println("Initialising the test");
		  driver = utilities.DriverFactory.open("chrome");
		  driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
		  driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div[2]/a")).click();
		  
	}
	
	@After 
	public void tearDown() {
		System.out.println("Closijng the test");
		driver.close();
		
	}
}
