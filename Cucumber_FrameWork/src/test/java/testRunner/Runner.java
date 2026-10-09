package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"./featurefiles/hrm.feature"},
dryRun = false,glue = {"stepDefination"}
,plugin = {"pretty","html:target/report/cucumber",
		"junit:target/report/cucumber.xml",
		"json:target/report/cucumber.json"},tags="@login or @AddEmp")

public class Runner {

}
