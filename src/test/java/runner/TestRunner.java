package runner;


import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.ExtentCucumberFormatter;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import java.io.File;
import java.io.IOException;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/Features",
        glue = "steps",
        plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
        monochrome = true
)
public class TestRunner {




    @AfterClass
    public static void AfterScenario() throws IOException {
//        Reporter.addScreenCaptureFromPath("D:/AutoTestPractice/CucumberDemo/target/cucumber-reports/image/error1.png");
        Reporter.addScreenCaptureFromPath("./image/error1.png");
        Reporter.loadXMLConfig(new File("config/report.xml"));
    }
}

