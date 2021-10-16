package runner;


import com.vimalselvam.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.After;
import org.junit.runner.RunWith;

import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/Features",
        glue = "steps",
        plugin = { "target/reports/report.html"},
        monochrome = true
)
public class TestRunner {
    @After
    public void AfterScenario() {
        Reporter.loadXMLConfig(new File("config/report.xml"));
    }
}

