package StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class LoginDemoSteps {
    WebDriver driver= null;

//    @Given("^Browser should be in open condition$")
//    public void browser_should_be_in_open_condition() throws Throwable {
//        System.out.println("step inside: Browser should be in open condition ");
//        driver = WebDriverManager.edgedriver().create();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//
//    }
//    @And("^User is on login page$")
//    public void user_is_on_login_page() throws Throwable {
//        System.out.println("step inside: User is on login page");
//        //driver.get("https://rahulshettyacademy.com/client/auth/login");
//        driver.get("http://hrm.sti.com/symfony/web/index.php/auth/login");
//        Thread.sleep(3000);
//
//    }
//
//    @When("^User enters the (.*) and (.*)$")
//    public void user_enters_the_username_and_password(String Usname, String password) throws Throwable {
//        System.out.println("step inside: User enters the username and password ");
////        driver.findElement(By.id("userEmail")).sendKeys("prathibhasuresh55@gmail.com");
////        driver.findElement(By.id("userPassword")).sendKeys("Prathisuri@123");
//        driver.findElement(By.id("txtUsername")).sendKeys(Usname);
//        driver.findElement(By.id("txtPassword")).sendKeys(password);
//        Thread.sleep(2000);
//
//    }
//
//    @And("^User clicks on login$")
//    public void user_clicks_on_login() throws Throwable {
//        System.out.println("step inside: User clicks on login ");
//        driver.findElement(By.id("btnLogin")).click();
//        Thread.sleep(3000);
//
//    }
//    @Then("^user should navigated to the homepage$")
//    public void user_should_navigated_to_the_homepage() throws Throwable {
//        System.out.println("step inside: user should navigated to the homepage ");
//        boolean flag = driver.findElement(By.xpath("//img[@alt='Sun Technologies']")).isDisplayed();
//        Assert.assertEquals(true,flag);
//        driver.quit();
//    }
}
