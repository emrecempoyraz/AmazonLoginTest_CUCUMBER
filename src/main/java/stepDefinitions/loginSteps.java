package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import testManager.IDriver;
import testManager.baseTest;

import static testManager.driverSetup.driver;

public class loginSteps {

    private final HomePage homePage = new HomePage(driver);

    @Given("Navigate to website")
    public void navigate_to_website() {
        baseTest.navigateToUrl(IDriver.URL);
        homePage.acceptCookies();

    }

    @Given("click login button")
    public void click_login_button() {
        homePage.hoverOverNavigation();
        homePage.clickLoginButton();
    }

    @Given("type eMail {string}")
    public void type_e_mail(String email) {
       homePage.typeEmail(email);
    }

    @Given("type password {string}")
    public void type_password(String password) {
        homePage.clickContinue();
        homePage.typePassword(password);

    }

    @When("submit login form")
    public void submit_login_form() {
        homePage.submitLoginForm();
    }

    @Then("verify message")
    public void verify_message() {
        homePage.assertMessage();
    }


}
