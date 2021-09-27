package bdd.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/bdd/features"},
        glue = {"bdd.steps","bdd.bases"},
        plugin = {"pretty"},
        tags = "@atc"
)
public class RunnerCucumber {
}
