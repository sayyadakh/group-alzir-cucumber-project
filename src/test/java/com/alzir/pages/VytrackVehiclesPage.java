package com.alzir.pages;

import com.alzir.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VytrackVehiclesPage {

    public VytrackVehiclesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@title='Filters']" )
    public WebElement filtersBtn ;

    @FindBy(xpath = "//a[@class='add-filter-button']")
    public WebElement manageFiltersBtn;

    @FindBy(xpath = "//label[@title='Tags']")
    public WebElement tags;

    @FindBy(xpath = "//div[@class='filter-item oro-drop']/div[1]")
    public WebElement tagsAll;

    @FindBy(linkText = "is any of")
    public WebElement isAnyOf;

    @FindBy(xpath = "//input[@id='s2id_autogen4']")
    public WebElement inputVehicleType;

    @FindBy(xpath = "//div[@id='select2-drop']//ul//li")
    public WebElement compactBtn;

    @FindBy(xpath = "//button[@class='btn btn-primary filter-update']")
    public WebElement updateBtn;

    @FindBy(xpath = "//td[@data-column-label='Tags']//ul/li[5]")
    public List<WebElement> getCompactTxts;




}
