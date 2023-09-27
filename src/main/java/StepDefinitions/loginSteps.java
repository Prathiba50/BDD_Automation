package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class loginSteps {
    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("Inside step: user is on login page ");
    }

    @When("user is enters the username and password")
    public void user_is_enters_the_username_and_password() {
        System.out.println("Inside step: user is enters the username and password ");

    }

    @When("clicks on login button")
    public void clicks_on_login_button() {
        System.out.println("Inside step: clicks on login button ");
    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        System.out.println("Inside step:user is navigated to the home page ");
    }


}
