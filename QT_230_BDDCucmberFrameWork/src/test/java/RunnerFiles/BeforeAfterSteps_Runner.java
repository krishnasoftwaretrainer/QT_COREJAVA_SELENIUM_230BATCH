package RunnerFiles;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features/BeforeAfterSteps.feature",
						glue = {"stepDefinations","hooks"},
		monochrome = true,
		plugin = {"pretty", "html:target/SwagReport.html"}
		)


public class BeforeAfterSteps_Runner {

}
