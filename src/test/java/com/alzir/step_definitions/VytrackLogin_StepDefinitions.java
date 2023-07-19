package com.alzir.step_definitions;

import com.alzir.pages.VytrackLoginPage;

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


}
