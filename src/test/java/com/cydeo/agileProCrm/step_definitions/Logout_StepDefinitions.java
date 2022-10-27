package com.cydeo.agileProCrm.step_definitions;

import com.cydeo.agileProCrm.pages.LoginPage;
import com.cydeo.agileProCrm.pages.Logout;
import com.cydeo.agileProCrm.utilities.ConfigurationReader;
import com.cydeo.agileProCrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Logout_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    Logout logout = new Logout();


    @Given("user logged in with valid credentials {string} and {string}")
    public void user_logged_in_with_valid_credentials_and(String username, String password) {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.inputUserName.sendKeys(username);
        loginPage.inputPassword.sendKeys(password);
        loginPage.loginBtn.click();
    }
    @When("user click on the user block")
    public void user_click_on_the_user_block() {
        logout.userBlock.click();
    }
    @When("user click on the Logout button")
    public void user_click_on_the_logout_button() {
        logout.logoutBtn.click();
    }
    @Then("user should navigated to the login page")
    public void user_should_navigated_to_the_login_page() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Authorization"));
    }
    @Then("user click on the step back button")
    public void user_click_on_the_step_back_button() {
        Driver.getDriver().navigate().back();
    }
    @Then("user should stay on the login page")
    public void user_should_stay_on_the_login_page() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Authorization"));
    }

    @When("user closes the browser")
    public void userClosesTheBrowser() {
        Driver.closeDriver();
    }

    @And("navigate to the login page")
    public void navigateToTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Then("user should not logged in")
    public void userShouldNotLoggedIn() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Authorization"));
    }
}
