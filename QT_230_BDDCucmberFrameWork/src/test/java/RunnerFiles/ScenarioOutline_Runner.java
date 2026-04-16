package RunnerFiles;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features/SwagLoginOutLine.feature",
		glue="stepDefinations",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","html:target/ScenarioOutlineReport.html"}
		
		)

public class ScenarioOutline_Runner {

}
