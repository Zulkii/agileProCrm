package com.cydeo.agileProCrm.pages;

import com.cydeo.agileProCrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {

    public Logout(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "user-block")
    public WebElement userBlock;

    @FindBy(xpath = "//span[.=\"Log out\"]")
    public WebElement logoutBtn;




}
