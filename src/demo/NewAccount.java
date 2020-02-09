package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class NewAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/roopa/Documents/software/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
		driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div[2]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"MainContent_txtFirstName\"]")).sendKeys("Charles");
		driver.findElement(By.xpath("//*[@id=\"MainContent_txtEmail\"]")).sendKeys("test1@test.com");
		driver.findElement(By.xpath("//*[@id=\"MainContent_txtHomePhone\"]")).sendKeys("245465765");
//		driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div[2]/div[4]/div[2]/label[1]")).click();
		driver.findElement(By.cssSelector("input[name='ctl00$MainContent$Gender'][value='Male']")).click();
		driver.findElement(By.xpath("//*[@id=\"MainContent_txtPassword\"]")).sendKeys("testpwd");
		driver.findElement(By.xpath("//*[@id=\"MainContent_txtVerifyPassword\"]")).sendKeys("testpwd");
		new Select(driver.findElement(By.id("MainContent_menuCountry"))).selectByValue("India");
		driver.findElement(By.id("MainContent_btnSubmit")).click();
		driver.quit();
		
	
		
	}

}
