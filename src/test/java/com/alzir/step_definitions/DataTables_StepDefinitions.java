package com.alzir.step_definitions;

import com.alzir.pages.VytrackPages.VytrackDashboardPage;
import com.alzir.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DataTables_StepDefinitions {
    VytrackDashboardPage vytrackDashboardPage=new VytrackDashboardPage();


    @Then("user should be able to see following modules")
    public void user_should_be_able_to_see_following_modules(List<String> expectedModules ) {



        List<String> actualModules = new ArrayList<>();

        for (WebElement eachModule : vytrackDashboardPage.allTopModules) {

            BrowserUtils.sleep(5);

            actualModules.add(eachModule.getText());
        }
        
        Assert.assertEquals(expectedModules,actualModules);

    }


    }
