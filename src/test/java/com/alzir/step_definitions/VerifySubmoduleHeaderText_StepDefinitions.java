package com.alzir.step_definitions;

import com.alzir.pages.VytrackPages.VytrackDashboardPage;
import io.cucumber.java.en.When;

public class VerifySubmoduleHeaderText_StepDefinitions {

    String moduleHeaderGlobal = "";
    VytrackDashboardPage vytrackDashboardPage = new VytrackDashboardPage();


    @When("user hovers over to a {string} and navigates to a {string}")
    public void user_hovers_over_to_a_and_navigates_to_a(String tab, String module) {
        this.moduleHeaderGlobal = module;
        vytrackDashboardPage.navigateToModule(tab, module);
    }
    @When("user verifies {string}")
    public void user_verifies(String moduleHeader) {
         moduleHeader =moduleHeaderGlobal;
        System.out.println("moduleHeader from feature file = " + moduleHeader);
        vytrackDashboardPage.verifySubmoduleHeaderText(moduleHeader);
    }
}
