package hybridFrameWork;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/hybridFrameWork/SwagLogin_ScenarioOutline_hybrid.feature",
		glue="hybridFrameWork",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","html:target/ScenarioOutlineHybridReport.html"}
		
		)



public class RunnerClass 
{
	

}
