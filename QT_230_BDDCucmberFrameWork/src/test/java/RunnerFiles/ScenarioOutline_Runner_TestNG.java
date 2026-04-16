package RunnerFiles;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features="src/test/resources/Features/SwagLoginOutLine.feature",
		glue = {"stepDefinations"},
        plugin = {
                "pretty",
                "html:target/cucumber-report.html"
        },
        monochrome = true
)

public class ScenarioOutline_Runner_TestNG extends AbstractTestNGCucumberTests
{

}
