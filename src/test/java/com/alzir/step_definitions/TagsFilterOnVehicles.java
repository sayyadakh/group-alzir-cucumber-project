package com.alzir.step_definitions;

import com.alzir.pages.VytrackPages.VytrackDashboardPage;
import com.alzir.pages.VytrackPages.VytrackVehiclesPage;
import com.alzir.utilities.BrowserUtils;
import com.alzir.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class TagsFilterOnVehicles {
    VytrackDashboardPage vytrackDashboardPage = new VytrackDashboardPage();
    VytrackVehiclesPage vytrackVehiclesPage = new VytrackVehiclesPage();

    @When("user is on dashboard page")
    public void user_is_on_dashboard_page() {
        Driver.getDriver().get("https://qa3.vytrack.com/dashboard/view/1?change_dashboard=1");
        BrowserUtils.sleep(10);

    }
    @When("user click on vehicles button")
    public void user_click_on_vehicles_button() {
        vytrackDashboardPage.vehicleBtn.click();
    }
    @When("user select tags filter")
    public void user_select_tags_filter() {
        vytrackVehiclesPage.filtersBtn.click();
        vytrackVehiclesPage.manageFiltersBtn.click();
        vytrackVehiclesPage.tags.click();

    }
    @Then("user select is any of on filer options")
    public void user_select_is_any_of_on_filer_options() {
        vytrackVehiclesPage.tagsAll.click();
        vytrackVehiclesPage.isAnyOfBtn.click();
       // vytrackVehiclesPage.isAnyOf.click();

    }
    @Then("user select compact value")
    public void user_select_compact_value() {
        vytrackVehiclesPage.inputVehicleType.sendKeys("compact",Keys.ENTER);
    }
    @Then("user sees all the compact tagged vehicles on the page")
    public void user_sees_all_the_compact_tagged_vehicles_on_the_page() {

        for(WebElement each: vytrackVehiclesPage.getCompactTxts){
            Assert.assertEquals(each,"compact");
        }

    }
}
