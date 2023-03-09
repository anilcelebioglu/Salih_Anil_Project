package com.Galeto.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
plugin = {
        "html:target/cucumber-reports.html",
        "rerun:target/rerun.txt",
        "me.jvt.cucumber.report.PrettyReports:target/cucumber"
},
        features = "src/test/resources/Features",
        glue = "com/Galeto/stepDefinations",
        dryRun = false,
        tags = "",
        publish = true //generating a report with public link


)

public class CukesRunner {
}
