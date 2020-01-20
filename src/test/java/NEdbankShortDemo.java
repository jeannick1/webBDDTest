import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import  cucumber.api.testng.CucumberFeatureWrapper;
import  cucumber.api.testng.TestNGCucumberRunner;
import org.testng.annotations.DataProvider;



@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"src/test/java/stepdefs"},

        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"
        })

public class NEdbankShortDemo {

}
