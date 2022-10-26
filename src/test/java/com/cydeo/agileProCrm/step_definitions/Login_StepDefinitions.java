package com.cydeo.agileProCrm.step_definitions;

import com.cydeo.agileProCrm.pages.LoginPage;
import com.cydeo.agileProCrm.utilities.ConfigurationReader;
import com.cydeo.agileProCrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Login_StepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("User is on the Login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    // ------HR user--------
    @When("HR user enter valid username {string}")
    public void hr_user_enter_valid_username(String username) {
        loginPage.inputUserName.sendKeys(username);
    }
    @When("HR user enter valid password {string}")
    public void hr_user_enter_valid_password(String password) {
        loginPage.inputPassword.sendKeys(password);
    }

    // --------Marketing user ---------
    @When("Marketing user enter valid username {string}")
    public void marketingUserEnterValidUsername(String username) {
        loginPage.inputUserName.sendKeys(username);
    }

    @And("Marketing user enter valid password {string}")
    public void marketingUserEnterValidPassword(String password) {
        loginPage.inputPassword.sendKeys(password);
    }

    //------------Helpdesk user--------
    @When("Helpdesk user enter valid username {string}")
    public void helpdeskUserEnterValidUsername(String username) {
        loginPage.inputUserName.sendKeys(username);
    }

    @And("Helpdesk user enter valid password {string}")
    public void helpdeskUserEnterValidPassword(String password) {
        loginPage.inputPassword.sendKeys(password);
    }

    // -----------same for all users------------
    @When("User click on the login button")
    public void user_click_on_the_login_button() {
        loginPage.loginBtn.click();
    }
    @Then("User should land on the homepage")
    public void user_should_land_on_the_homepage() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Portal"));
    }


    // -------Invalid credentials---
    @When("user enter invalid username {string}")
    public void userEnterInvalidUsername(String username) {loginPage.inputUserName.sendKeys(username);
    }

    @And("user enter invalid password {string}")
    public void userEnterInvalidPassword(String password) {
        loginPage.inputPassword.sendKeys(password);
    }

    @Then("User should see error message")
    public void userShouldSeeErrorMessage() {
        Assert.assertTrue(loginPage.errorText.isDisplayed());
    }

    @When("user click on the checkbox")
    public void userClickOnTheCheckbox() {
        loginPage.checkBox.click();
    }

    @Then("checkbox should be selected")
    public void checkboxShouldBeSelected() {
        Assert.assertTrue(loginPage.checkBox.isSelected());
    }

    @When("user click on the FORGOT YOUR PASSWORD link")
    public void userClickOnTheFORGOTYOURPASSWORDLink() {
        loginPage.getPasswordLink.click();
    }

    @Then("user should be land on Get Password page")
    public void userShouldBeLandOnGetPasswordPage() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Get Password"));
    }
}
