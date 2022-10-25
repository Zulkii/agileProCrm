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
    @When("HR user enter valid username {string}")
    public void hr_user_enter_valid_username(String username) {
        loginPage.inputUserName.sendKeys(username);
    }
    @When("HR user enter valid password {string}")
    public void hr_user_enter_valid_password(String password) {
        loginPage.inputPassword.sendKeys(password);
    }
    @When("Marketing user enter valid username {string}")
    public void marketingUserEnterValidUsername(String username) {
        loginPage.inputUserName.sendKeys(username);
    }

    @And("Marketing user enter valid password {string}")
    public void marketingUserEnterValidPassword(String password) {
        loginPage.inputUserName.sendKeys(password);
    }
    @When("User click on the login button")
    public void user_click_on_the_login_button() {
        loginPage.loginBtn.click();
    }
    @Then("User should land on the homepage")
    public void user_should_land_on_the_homepage() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Portal"));
    }


}
