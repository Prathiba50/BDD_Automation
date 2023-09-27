package StepDefinitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class googleSearchSteps {
    WebDriver driver = null;
    @Given("browser is open")
    public void browser_is_open() {
        String projectPath = System.getProperty("user.dir");
        System.out.println("project path is : "+projectPath);

        System.out.println("Inside step: browser is open ");

        driver = WebDriverManager.edgedriver().create();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://google.com");
      //  driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        //driver.manage().window().maximize();
    }

    @And("User is on google search page")
    public void user_is_on_google_search_page() {
        System.out.println("Inside step: User is on google search page");
        driver.navigate().to("https://google.com");


    }

    @When("User enters the text in search box.")
    public void user_enters_the_text_in_search_box() throws InterruptedException {
        System.out.println("Inside step: User enters the text in search box.");
        driver.findElement(By.name("q")).sendKeys("step by step automation");
        Thread.sleep(2000);

    }

    @And("hits enter")
    public void hits_enter() throws InterruptedException {
        System.out.println("Inside step: hits enter");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);

    }

    @Then("user is navigated to the search results")
    public void user_is_navigated_to_the_search_results() throws InterruptedException {
        System.out.println("Inside step: user is navigated to the search results");
        driver.getPageSource().contains("Online Courses");
        Thread.sleep(2000);
        driver.quit();
    }

}
