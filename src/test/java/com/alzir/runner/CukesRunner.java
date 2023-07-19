package com.alzir.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        features = "src/test/resources/features",
        glue = "com/alzir/step_definitions",
        dryRun = false,
        tags = "@login",
        publish = true // generating a report with public link
        //, monochrome = true // change the color in teh console

)
public class CukesRunner {
}
