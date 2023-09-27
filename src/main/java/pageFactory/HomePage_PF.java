package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {
    WebDriver driver;

    @FindBy(xpath = "//img[@alt='Sun Technologies']")
    private WebElement logo;

    @FindBy(xpath = "//a[@id='welcome']")
    private WebElement profile;

    @FindBy(xpath = "//a[text()='Logout']")
    private WebElement logOut;

    public HomePage_PF(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void verifyLogo(){logo.isDisplayed(); }

    public void clickOnLogout(){
        profile.click();
        logOut.click();
    }
}
