package com.alzir.pages;

import com.alzir.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VytrackLoginPage {

    public VytrackLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="prependedInput")
    public WebElement usernameInput;


    @FindBy(id="prependedInput2")
    public WebElement passwordInput;

    @FindBy(name = "_submit")
    public WebElement loginButton;

    public void login(String userNameStr, String passwordStr) {
        usernameInput.sendKeys(userNameStr);
        passwordInput.sendKeys(passwordStr);
        loginButton.click();
        // verification that we logged
    }


}
