package com.alzir.pages.VytrackPages;

import com.alzir.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VytrackDashboardPage extends BasePage {

    public VytrackDashboardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//i[@class='fa-question-circle']")
    public WebElement questionMark;

    @FindBy(xpath = "//span[@class='title title-level-1']")
    public List<WebElement> allTopModules;

    @FindBy(linkText = "Vehicles")
    public WebElement vehicleBtn;

    @FindBy(xpath = "//span[.='Vehicle Contracts']")
    public WebElement vehicleContracts;


}
