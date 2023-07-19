package com.alzir.pages;

import com.alzir.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleServiceLogPage {
    public VehicleServiceLogPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[contains(text(),\"Fleet\")]")
    public WebElement fleetMod;

    @FindBy(xpath = "//span[text()=\"Vehicle Services Logs\"]")
    public WebElement vehicleLog;

    @FindBy(xpath = "//div[text()=\"You do not have permission to perform this action.\"]")
     public WebElement message;



}
