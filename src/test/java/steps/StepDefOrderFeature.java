package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefOrderFeature 
{
	public static String product;

@Given("User is at product page.")
public void user_is_at_product_page() 
{
   System.out.println("User is at product page");
	
}

@When("he added a product to a cart.")
public void he_added_a_product_to_a_cart()
{
  product = "Nike Shoe";

System.out.println("He added ***"+product +"*** to cart");
}

@Given("The order is already placed.")
public void the_order_is_already_placed() {
   
}
@When("User clicks on cancle order button")
public void user_clicks_on_cancle_order_button() {

}
@Then("user is able cancle his order")
public void user_is_able_cancle_his_order() {

}



}


