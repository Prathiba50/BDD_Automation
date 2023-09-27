package StepDefinitions;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = {"classpath:Feature"}, glue = {"StepDefinitions"},
        monochrome = true,
         dryRun = false,
//        plugin = {"pretty", "html:target/HtmlReports",
//                "json:target/J[SONReport/report.json",
//                "junit:target/JUNITReport/report.xml"},
        tags = {"@smoke876"})

public class TestRunnerWithSingleTags extends AbstractTestNGCucumberTests {
    String sourceDir = "./src/main/resources/";
}
