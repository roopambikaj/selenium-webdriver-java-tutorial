package stepImplementations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDDLoginTest {

	@Given("^user is on login page$")
	public void user_is_on_login_page() {
		System.out.println("user enters correct username and correct password");
	}
	
    @When("^user enters correct username and correct password$")
    public void user_enters_correct_username_and_correct_password() {
    	System.out.println("user enters correct username and correct password");
    }
    
    @Then("^user gets confirmation$")
    public void user_gets_confirmation() {
    	System.out.println("user gets confirmation");
    }
	
}
