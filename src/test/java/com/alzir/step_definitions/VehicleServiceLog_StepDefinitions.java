package com.alzir.step_definitions;

import com.alzir.pages.VehicleServiceLogPage;
import com.alzir.utilities.BrowserUtils;
import com.alzir.utilities.ConfigurationReader;
import com.alzir.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class VehicleServiceLog_StepDefinitions {
     VehicleServiceLogPage vehicleServiceLogPage = new VehicleServiceLogPage();
//    @When("user hover over on {string} module")
//    public void user_hover_over_on_module(String module) {
//     Actions actions = new Actions(Driver.getDriver());
//        actions.moveToElement(vehicleServiceLogPage.fleetMod).perform();
//    }
    @When("user hover over on Fleet module")
    public void userHoverOverOnFleetModule() {
        BrowserUtils.sleep(3);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(vehicleServiceLogPage.fleetMod).perform();
    }

    @When("user should see {string}")
    public void user_should_see(String expectedModule) {
        Assert.assertEquals(expectedModule,vehicleServiceLogPage.vehicleLog.getText());

    }

    @When("user click on {string} button")
    public void user_click_on_button(String serviceVehicleLog) {
        vehicleServiceLogPage.vehicleLog.click();
        BrowserUtils.sleep(3);

    }

    @Then("verify user sees {string} message")
    public void verify_user_sees_message(String expectedMessage) {
         Assert.assertEquals(expectedMessage,vehicleServiceLogPage.message.getText());
    }



}
