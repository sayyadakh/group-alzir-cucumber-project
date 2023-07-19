package com.alzir.step_definitions;

import com.alzir.pages.VytrackLoginPage;
import com.alzir.utilities.ConfigurationReader;
import com.alzir.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VytrackLogin_StepDefinitions {

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("vyTrackUrl"));
    }


    @When("user logged in as {string}")
    public void userLoggedInAs(String userType ) {
        String username = null;
        String password = null;

        if(userType.equalsIgnoreCase("driver")){
            username = ConfigurationReader.getProperty("driver_username");
            password = ConfigurationReader.getProperty("driver_password");
        }else if(userType.equalsIgnoreCase("sales Manager")){
            username = ConfigurationReader.getProperty("sales_manager_username");
            password = ConfigurationReader.getProperty("sales_manager_password");
        }else if(userType.equalsIgnoreCase("store Manager")){
            username = ConfigurationReader.getProperty("store_manager_username");
            password = ConfigurationReader.getProperty("store_manager_password");
        }

        VytrackLoginPage loginPage = new VytrackLoginPage();
        loginPage.login(username,password);
    }

       @When("user logged in with username as {string} and password {string}")
       public void userLoggedInWithUsernameAsAndPassword(String username, String password) {
       VytrackLoginPage loginPage = new VytrackLoginPage();
        loginPage.login(username,password);
    }
}
