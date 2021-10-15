package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\trang.nguyen24_onemo\\Documents\\MyPractice\\Cucumber\\Demo\\src\\Features",
        glue = "steps"
)
public class TestRunner {
}
