package com.alzir.step_definitions;

import com.alzir.pages.VytrackDashboardPage;
import com.alzir.pages.VytrackLoginPage;
import com.alzir.utilities.BrowserUtils;
import com.alzir.utilities.ConfigurationReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DataTables_StepDefinitions {
    VytrackDashboardPage vytrackDashboardPage=new VytrackDashboardPage();

    @Then("user should be able to see following modules")
    public void user_should_be_able_to_see_following_modules(List<String> expectedModules ) {

        BrowserUtils.sleep(5);

        List<String> actualModules = new ArrayList<>();

        for (WebElement eachModule : vytrackDashboardPage.allTopModules) {

            actualModules.add(eachModule.getText());
        }
        Assert.assertEquals(expectedModules,actualModules);

    }


    }
