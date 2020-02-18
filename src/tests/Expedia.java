package tests;

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
	int child = 2;
	int infant = 1;
	int childAge =3;
	WebElement addAdult, addChild, addInfant;
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
			addAdult = driver.findElement(By.xpath("//div[@class='traveler-selector-room-data target-clone-field']/div/div[4]/button"));
			addAdultToRoom(updateTravelerJSE, addAdult);
		}
		else if (adult < 2) {
			addAdult = driver.findElement(By.xpath("//div[@class='traveler-selector-room-data target-clone-field']/div/div[2]/button"));
			minusAdultToRoom(updateTravelerJSE, addAdult);
		} else {
			System.out.println("Default value used");
		}
		
		
		//add child
		if (child>0) {
			addChild = driver.findElement(By.xpath("//div[@class='traveler-selector-room-data target-clone-field']/div[@class='children-wrapper']/div/div[4]"));
			addChildToRoom(updateTravelerJSE, addChild, childAge);
		}else {
			System.out.println("Default value used");
		}
		
		// modify the search
		// analyse the result
		// book the hotel
		// fill out the details
		// confirmation
		
		
	}
	
	public void addAdultToRoom(JavascriptExecutor updateTravelerJSE, WebElement addAdult) {
		for(int i = 2; i<adult; i++) {
			updateTravelerJSE.executeScript("arguments[0].click();", addAdult);
			
		}
	}
	
	public void minusAdultToRoom(JavascriptExecutor updateTravelerJSE, WebElement addAdult) {
		for(int i =2; i>adult; i--) {
			updateTravelerJSE.executeScript("arguments[0].click();", addAdult);
			
		}
	}
	
	public void addChildToRoom(JavascriptExecutor updateTravelerJSE, WebElement addChild, int childAge ) {
		for(int i =0; i<child; i++) {
			updateTravelerJSE.executeScript("arguments[0].click();", addChild);
	        String ageValue;
	        switch (childAge) {
	            case 1:  ageValue = "2";
	                     break;
	            case 2:  ageValue = "February";
	                     break;
	            case 3:  ageValue = "March";
	                     break;
	            case 4:  ageValue = "April";
	                     break;
	            case 5:  ageValue = "May";
	                     break;
	            case 6:  ageValue = "June";
	                     break;
	            case 7:  ageValue = "July";
	                     break;
	            case 8:  ageValue = "August";
	                     break;
	            case 9:  ageValue = "September";
	                     break;
	            case 10: ageValue = "October";
	                     break;
	            case 11: ageValue = "November";
	                     break;
	            case 12: ageValue = "December";
	                     break;
	            default: ageValue = "Invalid month";
	                     break;
	        }
	        System.out.println(ageValue);
			
			
			
		}
	}
	

	
	
	@BeforeMethod
	public void setup() {
		
		driver = utilities.DriverFactory.open(browserType);
		driver.get("https://www.expedia.co.uk");
		
	}
	@AfterMethod
	public void teardown() {
//	driver.quit();
		
	}
	
	
}
