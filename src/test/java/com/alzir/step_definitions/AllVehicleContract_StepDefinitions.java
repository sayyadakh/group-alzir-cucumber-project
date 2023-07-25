package com.alzir.step_definitions;

import com.alzir.pages.AllVehicleContractPage;
import com.alzir.pages.VytrackDashboardPage;
import com.alzir.utilities.BrowserUtils;
import com.alzir.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AllVehicleContract_StepDefinitions {

    VytrackDashboardPage vytrackDashboardPage = new VytrackDashboardPage();
    AllVehicleContractPage allVehicleContractPage = new AllVehicleContractPage();

    @When("user clicks on Vehicle Contracts button")
    public void user_clicks_on_vehicle_contracts_button() {
        vytrackDashboardPage.vehicleContracts.click();
    }

    @Then("user clicks on refresh button")
    public void user_clicks_on_refresh_button() {
//        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.elementToBeClickable(allVehicleContractPage.refreshButton));
        BrowserUtils.sleep(5);
        allVehicleContractPage.refreshButton.click();
        Assert.assertTrue(allVehicleContractPage.refreshButton.isEnabled());
    }



}
