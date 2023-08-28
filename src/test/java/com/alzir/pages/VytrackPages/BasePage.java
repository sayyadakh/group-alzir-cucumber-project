package com.alzir.pages.VytrackPages;

import com.alzir.utilities.BrowserUtils;
import com.alzir.utilities.DB_Util;
import com.alzir.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    public WebElement submodulePageHeader;


    public void navigateToModule(String tab, String module){
        BrowserUtils.sleep(5);

        String tabLocatorXPath = "//span[contains(text(),'" + tab + "') and @class='title title-level-1']";
        String moduleLocatorXPath = "//span[contains(text(),'" + module + "') and @class='title title-level-2']";
        BrowserUtils.hover(Driver.getDriver().findElement(By.xpath(tabLocatorXPath)));
        //Driver.getDriver().findElement(By.xpath(tabLocatorXPath));
        BrowserUtils.sleep(5);
        Driver.getDriver().findElement(By.xpath(moduleLocatorXPath)).click();
        BrowserUtils.sleep(2);
    }

    public void verifySubmoduleHeaderText(String submoduleHeaderText){
       BrowserUtils.sleep(5);
        System.out.println("submoduleHeaderText = " + submoduleHeaderText);
        System.out.println("submoduleHeaderText from UI = " + submodulePageHeader.getText());
//        Assert.assertTrue(submoduleHeaderText.contains(submodulePageHeader.getText()));
        String[] submoduleHeaderTextArr = submodulePageHeader.getText().split(submoduleHeaderText);
        System.out.println("submoduleHeaderTextArr length = " + submoduleHeaderTextArr.length);
        System.out.println("submoduleHeaderTextArr = " + submoduleHeaderTextArr[0]);
        for (String each : submoduleHeaderTextArr) {
            if (each.equals(submodulePageHeader.getText())){
                Assert.assertEquals(submoduleHeaderText, submodulePageHeader.getText());
            }
        }
    }

}
