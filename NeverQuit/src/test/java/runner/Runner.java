package runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"classpath:features"},
		plugin = {"pretty", "html:target/cucumber-html-report"},
		tags = {"@Second"},
		glue={"helpers","classpath/stepDefinitions", "classpath/stepDefinitions.LogIn","classpath/stepDefinitions.Publish"},
//		dryRun = true,
		monochrome = true
		)
public class Runner
{
}