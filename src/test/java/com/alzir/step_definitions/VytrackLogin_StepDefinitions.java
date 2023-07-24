package com.alzir.step_definitions;

import com.alzir.pages.VytrackLoginPage;

import com.alzir.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class VytrackLogin_StepDefinitions {

    VytrackLoginPage vytrackLoginPage = new VytrackLoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get("https://qa.xfleetsolutions.com/user/login");
    }
    @When("user enters the driver information")
    public void user_enters_the_driver_information() {
        vytrackLoginPage.login("user1","UserUser123");
    }


    @Then("user should be able to login by verifying the Dashboard title")
    public void userShouldBeAbleToLoginByVerifyingTheDashboardTitle() {
        String expectedTitle = "Dashboard";
        BrowserUtils.sleep(8);
        String actualTitle = Driver.getDriver().getTitle();
//        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.titleIs(expectedTitle));
        Assert.assertEquals(expectedTitle, actualTitle);


    }
}
