package com.cydeo.agileProCrm.pages;

import com.cydeo.agileProCrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "USER_LOGIN" )
    public WebElement inputUserName;

    @FindBy(name = "USER_PASSWORD")
    public WebElement inputPassword;

    @FindBy(xpath = "//input[@class = 'login-btn']")
    public WebElement loginBtn;

    @FindBy(xpath = "//div[.='Incorrect login or password']")
    public WebElement errorText;

    @FindBy(xpath = "//input[@id=\"USER_REMEMBER\"]")
    public WebElement checkBox;

    @FindBy(xpath = "//a[.=\"Forgot your password?\"]")
    public WebElement getPasswordLink;


}
