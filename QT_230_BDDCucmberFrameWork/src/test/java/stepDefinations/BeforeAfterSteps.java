package stepDefinations;
import io.cucumber.java.en.*;

public class BeforeAfterSteps
{
	@Given("Step One")
	public void step_one() {
	    System.out.println("This is Step One");
	    }

	@When("Steo Two")
	public void steo_two() 
	{
		System.out.println("This is Step Two");
		}

	@And("Step Three")
	public void step_three() 
	{
		System.out.println("This is Step Three");
	}

	@Then("Step Four")
	public void step_four()
	{
	 System.out.println("This is Step Four");
	}


}
