package StepDefination;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\deepa\\Documents\\Barkha new intellij\\CucumberPractice1\\src\\test\\java\\Features_Files\\cucumber.feature",
        glue = {"StepDefination"}, plugin = {"pretty","html:target/Cucumberreports.html"})

public class TestRunner {
}
