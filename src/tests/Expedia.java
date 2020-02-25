package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Expedia {

	WebDriver driver;
	String browserType = "Chrome";
	String city = "London";
	String checkIn = "10/02/2020";
	String checkOut = "10/02/2020";
	int room = 2;
	int adult = 5;
	WebElement addAdult;
	JavascriptExecutor updateTravelerJSE = (JavascriptExecutor)driver;
	
	@Test
	public void hotelReservation() {
		
		// Search
		driver.findElement(By.xpath("//*[@id=\"tab-hotel-tab-hp\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"hotel-destination-hp-hotel\"]")).sendKeys(city);
		driver.findElement(By.id("hotel-checkin-hp-hotel")).sendKeys(checkIn);
		driver.findElement(By.id("hotel-checkout-hp-hotel")).sendKeys(checkOut);
		driver.findElement(By.cssSelector("button[type='button'][class='trigger-utility menu-trigger btn-utility btn-secondary "
				+ "dropdown-toggle theme-standard pin-left menu-arrow gcw-component gcw-traveler-amount-select gcw-component-initialized']")).click();
		// add travelers - adult, child , infants
		 // Add Adult
		
		if (adult > 2) { 
			for(int i = 2; i<adult; i++) {
			addAdult = driver.findElement(By.xpath("//div[@class='traveler-selector-room-data']/div/div[4]/button"));
			updateTravelerJSE.executeScript("arguments[0].click();", addAdult);
//			addAdultToRoom(updateTravelerJSE, addAdult);
			}
		}
		else if (adult < 2) {
			addAdult = driver.findElement(By.xpath("//div[@class='traveler-selector-room-data target-clone-field']/div/div[2]/button"));
			minusAdultToRoom(updateTravelerJSE, addAdult);
		} else {
			System.out.println("Default value used");
		}
		driver.findElement(By.id("//*[@id=\"search-button-hp-package\"]")).click();
		
		
		// modify the search
		
		// analyse the result
		// book the hotel
		// fill out the details
		// confirmation
		
		
	}
	
	public void addAdultToRoom(JavascriptExecutor updateTravelerJSE, WebElement addAdult) {
		
			updateTravelerJSE.executeScript("arguments[0].click();", addAdult);
			
	}
	
	public void minusAdultToRoom(JavascriptExecutor updateTravelerJSE, WebElement addAdult) {
		for(int i =2; i>adult; i--) {
			updateTravelerJSE.executeScript("arguments[0].click();", addAdult);
			
		}
	}

	

	
	
	@BeforeMethod
	public void setup() {
		
		driver = utilities.DriverFactory.open(browserType);
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("https://www.expedia.co.uk");
		
	}
	@AfterMethod
	public void teardown() {
//	driver.quit();
		
	}
	

}
