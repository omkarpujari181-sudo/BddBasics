package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderStepHalf 
{
	private StepDefOrderFeature order;
	
	public OrderStepHalf(StepDefOrderFeature order)
	{
		this.order = order;
	}
	
	@When("he clicks on order now button.")
	public void he_clicks_on_order_now_button() 
	{
		System.out.println("User clicked on order now button");
	}
	@Then("The order should get placed for product.")
	public void the_order_should_get_placed_for_product() 
	{
	  
		System.out.println("***"+ order.product +"*** gets ordered");

	}

}
