package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/roopa/Documents/software/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
		driver.findElement(By.name("ctl00$MainContent$txtUserName")).sendKeys("test@test.com");
		driver.findElement(By.name("ctl00$MainContent$txtPassword")).sendKeys("testpwd");
		driver.findElement(By.name("ctl00$MainContent$btnLogin")).click();
		String message = driver.findElement(By.id("conf_message")).getText();
		System.out.println("Confirmation: " + message);
		String pageTitle = driver.getTitle();
		System.out.println("Page Title: " + pageTitle);
		driver.close();
	}

}
