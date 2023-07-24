package com.alzir.step_definitions;

import com.alzir.pages.VytrackLoginPage;
import com.alzir.utilities.BrowserUtils;
import com.alzir.utilities.ConfigurationReader;
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
        Driver.getDriver().get(ConfigurationReader.getProperty("vyTrackUrl"));
    }
    @When("user logged in as {string}")
    public void userLoggedInAs(String userType) {
        String username = null;
        String password = null;

        if(userType.equalsIgnoreCase("driver")){
            username = ConfigurationReader.getProperty("driver_username");
            password = ConfigurationReader.getProperty("password");
        }else if(userType.equalsIgnoreCase("store manager")) {
            username = ConfigurationReader.getProperty("store_manager_username");
            password = ConfigurationReader.getProperty("password");
        }else if(userType.equalsIgnoreCase("sales manager")){
            username = ConfigurationReader.getProperty("sales_manager_username");
            password = ConfigurationReader.getProperty("password");
        }

        VytrackLoginPage loginPage = new VytrackLoginPage();
        loginPage.login(username,password);
    }
    }