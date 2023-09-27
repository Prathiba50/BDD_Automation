package StepDefinitions;

import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageFactory.HomePage_PF;
import pageFactory.LoginPage_PF;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class LoginDemoSteps_PF {
    WebDriver driver;
    LoginPage_PF loginPage_pf;
    HomePage_PF homePage_pf;

    @Given("^Browser should be in open condition$")
    public void browser_should_be_in_open_condition() throws Throwable {
        System.out.println("============I am inside LoginDemoSteps_PF===============");
        System.out.println("step inside: Browser should be in open condition ");
        driver = WebDriverManager.edgedriver().create();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }
    @And("^User is on login page$")
    public void user_is_on_login_page() throws Throwable {
        System.out.println("step inside: User is on login page");
        //driver.get("https://rahulshettyacademy.com/client/auth/login");
        driver.get("http://hrm.sti.com/symfony/web/index.php/auth/login");
        Thread.sleep(3000);

    }

    @When("^User enters the (.*) and (.*)$")
    public void user_enters_the_username_and_password(String Usname, String password) throws Throwable {
        System.out.println("step inside: User enters the username and password ");
        loginPage_pf = new LoginPage_PF(driver);
        loginPage_pf.enterUserName(Usname);
        loginPage_pf.enterPassword(password);

    }

    @And("^User clicks on login$")
    public void user_clicks_on_login() throws Throwable {
        System.out.println("step inside: User clicks on login ");
        loginPage_pf.clickOnLogin();
        Thread.sleep(3000);

    }
    @Then("^user should navigated to the homepage$")
    public void user_should_navigated_to_the_homepage() throws Throwable {
        homePage_pf = new HomePage_PF(driver);
        homePage_pf.verifyLogo();
    }

    @And("^CLick on Logout$")
    public void click_on_Logout() throws Throwable {
        homePage_pf.clickOnLogout();
        driver.quit();
    }
}
