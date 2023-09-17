package testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//JUnit - To initiate the run (single, group of Scenarios)
@RunWith(Cucumber.class)

//Map the feature file & steps definition file paths
@CucumberOptions(
        // ctrl + spacebar
        features = {"src/test/resources/featurefile"}, //path of feature file
        glue = {"stepdefinationfile"}, //step definition
        //tags = "@alpha"
        tags = "@Mouse",
        plugin = {"pretty"}
)


public class Runner {
}
