package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {
    WebDriver driver;

    @FindBy(id = "txtUsername")
    private WebElement userName;

    //This is another way to identify an elements on DOM
//    @FindBy(how = How.ID, using = "txtUsername" )
//    private WebElement UN;

    @FindBy(id = "txtPassword")
    private WebElement passWord;

    @FindBy(id = "btnLogin")
    private WebElement loginBTN;

    public LoginPage_PF(WebDriver driver){
        this.driver = driver;
       // PageFactory.initElements(driver,this); //or
        PageFactory.initElements(driver, this);
    }

    public void enterUserName(String UName) {
        userName.sendKeys(UName);
    }

    public void enterPassword(String PWord){
        passWord.sendKeys(PWord);
    }

    public void clickOnLogin(){
        loginBTN.click();
    }

}
