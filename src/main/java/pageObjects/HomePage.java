package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends basePage {

    @FindBy (css = "#sp-cc-accept")
    private WebElement acceptCookie ;

    @FindBy(css = "#nav-link-accountList-nav-line-1")
    private WebElement navLinkHoverOver ;

    @FindBy(xpath = "//div[@id='nav-flyout-ya-signin']")
    private WebElement loginButton ;

    @FindBy (css = "input#ap_email")
    private WebElement emailForm ;

    @FindBy(css = "input#continue")
    private WebElement continueButton ;

    @FindBy(css = "input#ap_password")
    private WebElement passwordForm ;

    @FindBy(css = "input#signInSubmit")
    private WebElement submitLogin;

    @FindBy(xpath = "//h4[text()='Bir sorun oluştu']")
    private WebElement warningMessage ;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void acceptCookies () {
        usefullMethods.clickElement(acceptCookie);
    }

    public void hoverOverNavigation () {
        usefullMethods.hoverOver(navLinkHoverOver);
    }

    public void clickLoginButton () {
        usefullMethods.clickElement(loginButton);
    }

    public void typeEmail (String email) {
        if (emailForm.isDisplayed())
            usefullMethods.clickElement(emailForm);
            usefullMethods.sendKeys(emailForm,email);
    }

    public void clickContinue () {
        if (continueButton.isDisplayed())
            usefullMethods.clickElement(continueButton);
    }

    public void typePassword (String password) {
        if (passwordForm.isDisplayed())
            usefullMethods.clickElement(passwordForm);
            usefullMethods.sendKeys(passwordForm,password);
    }

    public void submitLoginForm () {
        if (submitLogin.isDisplayed())
            usefullMethods.clickElement(submitLogin);
    }


    public void assertMessage () {
        usefullMethods.assertion(warningMessage,"Bir sorun oluştu");
    }








}
