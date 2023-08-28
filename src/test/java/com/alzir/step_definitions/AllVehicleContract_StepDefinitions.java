package com.alzir.step_definitions;

import com.alzir.pages.VytrackPages.AllVehicleContractPage;
import com.alzir.pages.VytrackPages.VytrackDashboardPage;
import com.alzir.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

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
