package com.alzir.step_definitions;

import com.alzir.utilities.BrowserUtils;
import com.alzir.utilities.ConfigurationReader;
import com.alzir.utilities.DB_Util;
import com.alzir.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {

    //import the @Before coming from io.cucumber.java
//    @Before(order = 1)
//    public void setupMethod() {
//        System.out.println("---> @Before: RUNNING BEFORE EACH SCENARIO");
//    }
//
//    //@Before (value = "@login", order = 2)
//    public void login_scenario_before() {
//        System.out.println("---> @Before: RUNNING BEFORE EACH SCENARIO");
//    }

    //@After will be executed automatically after EVERY scenario in the project
//    @After
//    public void teardownMethod(Scenario scenario) {
//
//        if (scenario.isFailed()) {
//
//            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
//            scenario.attach(screenshot, "image/png", scenario.getName());
//
//        }
//
//        System.out.println("---> @After: RUNNING AFTER EACH SCENARIO");
//        BrowserUtils.sleep(2);
//        Driver.closeDriver();
//    }



    @Before ("@ui")
    public void setUp(){
        System.out.println("this is coming from BEFORE");
        Driver.getDriver().manage().timeouts();
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().get(ConfigurationReader.getProperty("library_url"));


    }

    @After ("@ui")
    public void tearDown(Scenario scenario){
        System.out.println("this is coming from AFTER");

        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }

        Driver.closeDriver();

    }

    @Before ("@db")
    public void  setUpDB(){
        DB_Util.createConnection();
        System.out.println("Connecting to database............");
    }

    @After ("@db")
    public void destroyDB(){
        DB_Util.destroy();
        System.out.println("Closing connection.................");
    }

}
