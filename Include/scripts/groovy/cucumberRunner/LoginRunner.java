package cucumberRunner;

import internal.GlobalVariable;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
    features = "Include/features", // Path to your feature file
    glue = {"stepDefinitions"}, // Packages with step definitions and hooks
    plugin = {"pretty", 
    		"html:Reports/CucumberHTML",
    		"json:Reports/JSON/reports.json"
    		} // Generates reports
)

public class LoginRunner {

}