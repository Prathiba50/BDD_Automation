package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    protected WebDriver driver;
    private By txt_username = By.id("txtUsername");
    private By pwd = By.id("txtPassword");
    private By login = By.id("btnLogin");
    private By logo = By.xpath("//img[@alt='Sun Technologies']");
    private By profile = By.xpath("//a[@id='welcome']");
    private By logout = By.xpath("//a[text()='Logout']");

    public LoginPage(WebDriver driver){
        this.driver = driver;
        if(!driver.getTitle().equals("Sun Technologies HRM")){
            throw new IllegalStateException("This is not a login page. The current page is: "+driver.getCurrentUrl());
        }
    }

    public void enterUserName(String UserName){
        driver.findElement(txt_username).sendKeys(UserName);
    }

    public void enterPassword(String Password){
        driver.findElement(pwd).sendKeys(Password);
    }

    public void clickOnLogin(){
        driver.findElement(login).click();
    }

    public void verifyLogo(){
        driver.findElement(logo).isDisplayed();
    }

    public void clickOnLogout(){
        driver.findElement(profile).click();
        driver.findElement(logout).click();
    }

    public void validLogin(String Username, String password){
        driver.findElement(txt_username).sendKeys(Username);
        driver.findElement(pwd).sendKeys(password);
        driver.findElement(login).click();

    }

}
