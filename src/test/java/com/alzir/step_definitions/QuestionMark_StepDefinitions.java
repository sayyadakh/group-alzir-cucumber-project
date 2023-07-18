package com.alzir.step_definitions;

import com.alzir.pages.VytrackDashboardPage;
import com.alzir.pages.VytrackLoginPage;
import com.alzir.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class QuestionMark_StepDefinitions {

    VytrackLoginPage vytrackLoginPage = new VytrackLoginPage();
    VytrackDashboardPage vytrackDashboardPage = new VytrackDashboardPage();

    @Given("user clicks the question mark \\(get help)")
    public void user_clicks_the_question_mark_get_help() {
        Driver.getDriver().get("https://qa.xfleetsolutions.com/user/login");
        vytrackLoginPage.login("user1","UserUser123");
        vytrackDashboardPage.questionMark.click();

    }
    @Then("user verifies {string} title on a new opened tab")
    public void user_verifies_title_on_a_new_opened_tab(String expectedTitle) {
        for (String each : Driver.getDriver().getWindowHandles()){
            Driver.getDriver().switchTo().window(each);
        }
        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());

    }

}
