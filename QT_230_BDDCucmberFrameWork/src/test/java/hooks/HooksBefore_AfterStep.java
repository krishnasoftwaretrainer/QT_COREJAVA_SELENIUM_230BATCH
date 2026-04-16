package hooks;

import io.cucumber.java.*;

public class HooksBefore_AfterStep {

	//@BeforeStep
	@Before
	public void BeforeStep()
	{
		System.out.println("Before Scenario");
	}
	
	//@AfterStep
	@After
	public void AfterStep()
	{
		System.out.println("After Scenario");
	}
	
	

}
