package RunnerFiles;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/Features/SwagValidLogin.feature",
					"src/test/resources/Features/SwagInvalidLogin.feature",
					"src/test/resources/Features/SwagBlankLogin.feature"},
		glue = {"stepDefinations","hooks"},
		monochrome = true,
		plugin = {"pretty", "html:target/SwagReport.html"}
		)
public class SwagRunnerClass 
{
	

}
